package hr.nursic.library.service;

import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import hr.nursic.library.exception.ResourceNotAvailableException;
import hr.nursic.library.exception.ResourceNotFoundException;
import hr.nursic.library.model.Loan;
import hr.nursic.library.model.PhoneNumber;
import hr.nursic.library.model.User;
import hr.nursic.library.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Autowired
	private LoanService loanService;

	@Autowired
	private MicroblinkApiService microblinkApiService;

	public List<User> findAll() {
		return userRepository.findAll();
	}

	public User findById(long id) {
		return userRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("User with id " + id + " not found"));
	}

	public User save(User user) {
		return userRepository.save(user);
	}

	public User update(long userId, User userDetails) {
		User user = userRepository.findById(userId)
				.orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + " not found"));
		user.setName(userDetails.getName());
		user.setSurname(userDetails.getSurname());
		user.setDateOfBirth(userDetails.getDateOfBirth());
		user.setSex(userDetails.getSex());
		user.setPhoneNumbers(userDetails.getPhoneNumbers());
		return userRepository.save(user);
	}

	public void delete(long id) {

		if (!userRepository.existsById(id)) {
			throw new ResourceNotFoundException("User with id " + id + " not found");
		}
		if (!loanService.checkDidUserReturAllBook(id)) {
			throw new ResourceNotAvailableException(
					"User with id " + id + " did not return all books and can not be deleted");
		}
		userRepository.deleteById(id);
	}

	public User addPhoneNumber(long userId, PhoneNumber phoneNumber) {
		return userRepository.findById(userId).map(user -> {
			user.getPhoneNumbers().add(phoneNumber);
			return userRepository.save(user);
		}).orElseThrow(() -> new ResourceNotFoundException("User with id " + userId + "not found"));
	}

	public List<Loan> findAllLoans(long userId) {
		if (!userRepository.existsById(userId)) {
			throw new ResourceNotFoundException("User with id " + userId + " not found");
		}
		return loanService.findByUserId(userId);

	}

	public Map<User, Long> findUsersWithLongestOverdue() {				
		Map<User, Long> mapOfUsers = new HashMap<>();
		List<User> users = this.findAll();
		for (User user : users) {
			long delayInDays = 0;
			List<Loan> loans = this.findAllLoans(user.getId());
			for (Loan loan : loans) {
				// za posudbe koje nisu vracene ne racunamo
				if (null != loan.getActualReturnDate()
						&& loan.getActualReturnDate().after(loan.getExpectedReturnDate())) {
					delayInDays += ChronoUnit.DAYS.between(loan.getExpectedReturnDate().toInstant(),
							loan.getActualReturnDate().toInstant());
				}
			}
			mapOfUsers.put(user, delayInDays);
		}
		return mapOfUsers;
	}

	public User createUserFromScan(String image) {
		User user = microblinkApiService.getUserFromImage(image);
		save(user);
		return user;
	}

}

package hr.nursic.library.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import hr.nursic.library.dto.loan.LoansDto;
import hr.nursic.library.dto.user.UserDto;
import hr.nursic.library.dto.user.UserScanRegistrationRequest;
import hr.nursic.library.dto.user.UsersDto;
import hr.nursic.library.dto.user.UsersOverdueDto;
import hr.nursic.library.model.PhoneNumber;
import hr.nursic.library.model.User;
import hr.nursic.library.service.UserService;

@RestController
@RequestMapping("/api/users")
public class UserController extends AbstractController {

	@Autowired
	private UserService userService;

	@GetMapping("")
	public ResponseEntity<UsersDto> getAllUsers() {
		return ResponseEntity.ok(UsersDto.fromUserList(userService.findAll()));
	}

	@GetMapping("/{id}")
	public ResponseEntity<UserDto> getUserById(@PathVariable(value = "id") Long userId) {
		return ResponseEntity.ok(UserDto.fromUser(userService.findById(userId)));
	}

	@PostMapping("")
	public ResponseEntity<UserDto> createUser(@Valid @RequestBody User user) {
		return new ResponseEntity<UserDto>(UserDto.fromUser(userService.save(user)), HttpStatus.CREATED);
	}

	@PutMapping("/{id}")
	public ResponseEntity<UserDto> updateUser(@PathVariable(value = "id") Long userId,
			@Valid @RequestBody User userDetails) {
		return ResponseEntity.ok(UserDto.fromUser(userService.update(userId, userDetails)));
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<?> deleteUser(@PathVariable(value = "id") Long userId) {
		userService.delete(userId);
		return ResponseEntity.noContent().build();
	}

	@GetMapping("/{userId}/loans")
	public ResponseEntity<LoansDto> getAllLoansByUserId(@PathVariable(value = "userId") Long userId) {
		return ResponseEntity.ok(LoansDto.fromLoanList(userService.findAllLoans(userId)));
	}

	@GetMapping("/longestOverdue") 
	public ResponseEntity<UsersOverdueDto> get() {
		return ResponseEntity.ok(UsersOverdueDto.fromMapOfUserOverdue(userService.findUsersWithLongestOverdue()));
	}

	@PostMapping("/scanRegistration")
	public ResponseEntity<UserDto> createUserFromScan(
			@Valid @RequestBody UserScanRegistrationRequest userScanRegistrationRequest) {
		return new ResponseEntity<UserDto>(
				UserDto.fromUser(userService.createUserFromScan(userScanRegistrationRequest.getImage())),
				HttpStatus.CREATED);
	}

	@PostMapping("/{userId}/phoneNumbers")
	public ResponseEntity<UserDto> addPhoneNumberToUser(@PathVariable(value = "userId") Long userId,
			@Valid @RequestBody PhoneNumber phoneNumber) {
		return ResponseEntity.ok(UserDto.fromUser(userService.addPhoneNumber(userId, phoneNumber)));

	}

}

package hr.nursic.library.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import hr.nursic.library.model.Loan;

public interface LoanRepository extends JpaRepository<Loan, Long>{
	
	List<Loan> findByUserId(Long userId);
	
	@Query(value="select l.book_copy_id from loans l where l.id = ?1 limit 1", nativeQuery=true)
	Long findBookCopyIdById(Long id);
	
	Optional<Loan> findFirstByActualReturnDateNotNullAndUserId(Long userId);   
}

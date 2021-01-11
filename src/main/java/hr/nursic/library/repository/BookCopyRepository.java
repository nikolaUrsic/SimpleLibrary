package hr.nursic.library.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;
import hr.nursic.library.model.BookCopy;

public interface BookCopyRepository extends JpaRepository<BookCopy, Long>{
	List<BookCopy> findByBookId(Long bookId);
    Optional<BookCopy> findByIdAndBookId(Long id, Long bookId);
    Optional<BookCopy> findFirstByAvailableAndBookId(boolean availabl, Long bookId);        
}

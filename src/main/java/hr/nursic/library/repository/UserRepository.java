package hr.nursic.library.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import hr.nursic.library.model.User;

public interface UserRepository extends JpaRepository<User, Long>{

	@Override
    @Query("select e from User e where e.deleted is null")
    List<User> findAll();
	
	@Override
    @Query("select e from User e where e.deleted is null and e.id = ?1")
	Optional<User> findById(Long id);
 
    @Override
    @Modifying
    @Query("update User e set e.deleted = current_timestamp() where e.id = ?1")
    void deleteById(Long id);
	
}

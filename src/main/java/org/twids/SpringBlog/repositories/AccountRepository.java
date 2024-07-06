package org.twids.SpringBlog.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.twids.SpringBlog.models.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{
    
    //JPARepoda olmayan methodları ekliyoruz.
    Optional<Account> findOneByEmailIgnoreCase(String email);
    Optional<Account> findByToken(String token);
    
}

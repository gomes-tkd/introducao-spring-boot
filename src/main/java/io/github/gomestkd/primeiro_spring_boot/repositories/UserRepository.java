package io.github.gomestkd.primeiro_spring_boot.repositories;

import io.github.gomestkd.primeiro_spring_boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}

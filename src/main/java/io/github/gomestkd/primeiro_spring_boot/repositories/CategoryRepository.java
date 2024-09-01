package io.github.gomestkd.primeiro_spring_boot.repositories;

import io.github.gomestkd.primeiro_spring_boot.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}

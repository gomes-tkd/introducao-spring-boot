package io.github.gomestkd.primeiro_spring_boot.repositories;

import io.github.gomestkd.primeiro_spring_boot.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

}

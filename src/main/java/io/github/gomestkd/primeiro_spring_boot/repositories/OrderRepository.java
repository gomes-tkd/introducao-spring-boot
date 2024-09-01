package io.github.gomestkd.primeiro_spring_boot.repositories;

import io.github.gomestkd.primeiro_spring_boot.entities.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {

}

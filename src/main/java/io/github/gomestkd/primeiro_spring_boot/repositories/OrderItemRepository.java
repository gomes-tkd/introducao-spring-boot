package io.github.gomestkd.primeiro_spring_boot.repositories;

import io.github.gomestkd.primeiro_spring_boot.entities.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}

package io.github.gomestkd.primeiro_spring_boot.resources;

import io.github.gomestkd.primeiro_spring_boot.entities.OrderItem;
import io.github.gomestkd.primeiro_spring_boot.services.OrderItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/order-items")
public class OrderItemResources {

    @Autowired
    private OrderItemService service;

    @GetMapping
    public ResponseEntity<List<OrderItem>> findAll() {
        List<OrderItem> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<OrderItem> findById(@PathVariable("id") Long id) {
        OrderItem oi = service.findById(id);
        return ResponseEntity.ok().body(oi);
    }

}

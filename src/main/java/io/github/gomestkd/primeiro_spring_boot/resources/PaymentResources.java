package io.github.gomestkd.primeiro_spring_boot.resources;

import io.github.gomestkd.primeiro_spring_boot.entities.Payment;
import io.github.gomestkd.primeiro_spring_boot.entities.User;
import io.github.gomestkd.primeiro_spring_boot.services.PaymentService;
import io.github.gomestkd.primeiro_spring_boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/payments")
public class PaymentResources {

    @Autowired
    private PaymentService service;

    @GetMapping
    public ResponseEntity<List<Payment>> findAll() {
        List<Payment> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Payment> findById(@PathVariable("id") Long id) {
        Payment user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

}

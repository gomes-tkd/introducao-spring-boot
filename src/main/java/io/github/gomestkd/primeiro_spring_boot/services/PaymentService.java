package io.github.gomestkd.primeiro_spring_boot.services;

import io.github.gomestkd.primeiro_spring_boot.entities.Payment;
import io.github.gomestkd.primeiro_spring_boot.entities.User;
import io.github.gomestkd.primeiro_spring_boot.repositories.PaymentRepository;
import io.github.gomestkd.primeiro_spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    public List<Payment> findAll() {
        return repository.findAll();
    }

    public Payment findById(Long id) {
        Optional<Payment> obj = repository.findById(id);
        return obj.get();
    }
}

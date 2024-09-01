package io.github.gomestkd.primeiro_spring_boot.services;

import io.github.gomestkd.primeiro_spring_boot.entities.Category;
import io.github.gomestkd.primeiro_spring_boot.entities.User;
import io.github.gomestkd.primeiro_spring_boot.repositories.CategoryRepository;
import io.github.gomestkd.primeiro_spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    public List<Category> findAll() {
        return repository.findAll();
    }

    public Category findById(Long id) {
        Optional<Category> obj = repository.findById(id);
        return obj.get();
    }
}

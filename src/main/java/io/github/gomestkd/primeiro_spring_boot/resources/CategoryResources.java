package io.github.gomestkd.primeiro_spring_boot.resources;

import io.github.gomestkd.primeiro_spring_boot.entities.Category;
import io.github.gomestkd.primeiro_spring_boot.entities.User;
import io.github.gomestkd.primeiro_spring_boot.services.CategoryService;
import io.github.gomestkd.primeiro_spring_boot.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping (value = "/categories")
public class CategoryResources {

    @Autowired
    private CategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>> findAll() {
        List<Category> list = service.findAll();

        return ResponseEntity.ok().body(list);
    }

    @GetMapping (value = "/{id}")
    public ResponseEntity<Category> findById(@PathVariable("id") Long id) {
        Category user = service.findById(id);
        return ResponseEntity.ok().body(user);
    }

}

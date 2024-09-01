package io.github.gomestkd.primeiro_spring_boot.resources;

import io.github.gomestkd.primeiro_spring_boot.entities.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<User> findAll() {
        User user = new User(
                1L, "Gomes", "99999999999",
                "gomes@gmail.com", "123456"
        );

        return ResponseEntity.ok().body(user);
    }
}

package io.github.gomestkd.primeiro_spring_boot.config;

import io.github.gomestkd.primeiro_spring_boot.entities.User;
import io.github.gomestkd.primeiro_spring_boot.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    @Autowired
    private UserRepository userRepository;


    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Jose Gomes", "99999999999","gomes@gmail.com", "123456");
        User u2 = new User(null, "Jose Grego", "88888888888","grego@gmail.com", "123456");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

package com.jpafrota.demo.config;

import com.jpafrota.demo.entities.User;
import com.jpafrota.demo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // @AutoWired: Dependency injection. Spring automatically resolves this dependency.
    // Note that IUserRepository is an interface.
    @Autowired
    private IUserRepository userRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Jorge", "jpafrota@mot.com", "92984191630", "senha123");
        User u2 = new User(null, "Beatriz", "beatrizf@mot.com", "92993612266", "senha1234");

        userRepository.saveAll(Arrays.asList(u1, u2));
    }
}

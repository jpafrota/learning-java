package com.jpafrota.demo.config;

import com.jpafrota.demo.entities.Order;
import com.jpafrota.demo.entities.User;
import com.jpafrota.demo.repositories.IOrderRepository;
import com.jpafrota.demo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // @AutoWired: Dependency injection. Spring automatically resolves this dependency.
    // Note that IUserRepository is an interface.
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IOrderRepository orderRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Jorge", "jpafrota@mot.com", "92984191630", "senha123");
        User u2 = new User(null, "Beatriz", "beatrizf@mot.com", "92993612266", "senha1234");

        Order o1 = new Order(null, Instant.parse("2024-06-20T19:53:07Z"), u1);
        Order o2 = new Order(null, Instant.parse("2024-07-13T03:42:10Z"), u2);
        Order o3 = new Order(null, Instant.parse("2024-07-15T15:21:22Z"), u1);

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
    }
}

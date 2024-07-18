package com.jpafrota.demo.config;

import com.jpafrota.demo.entities.Category;
import com.jpafrota.demo.entities.Order;
import com.jpafrota.demo.entities.Product;
import com.jpafrota.demo.entities.User;
import com.jpafrota.demo.entities.enums.OrderStatus;
import com.jpafrota.demo.repositories.ICategoryRepository;
import com.jpafrota.demo.repositories.IOrderRepository;
import com.jpafrota.demo.repositories.IProductRepository;
import com.jpafrota.demo.repositories.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import java.time.Instant;
import java.util.Arrays;
import java.util.Optional;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {

    // @AutoWired: Dependency injection. Spring automatically resolves this dependency.
    // Note that IUserRepository is an interface.
    @Autowired
    private IUserRepository userRepository;

    @Autowired
    private IOrderRepository orderRepository;

    @Autowired
    private ICategoryRepository categoryRepository;

    @Autowired
    private IProductRepository productRepository;

    @Override
    public void run(String... args) throws Exception {
        User u1 = new User(null, "Jorge", "jpafrota@mot.com", "92984191630", "senha123");
        User u2 = new User(null, "Beatriz", "beatrizf@mot.com", "92993612266", "senha1234");

        Order o1 = new Order(null, Instant.parse("2024-06-20T19:53:07Z"), OrderStatus.PAID, u1);
        Order o2 = new Order(null, Instant.parse("2024-07-13T03:42:10Z"), OrderStatus.PAID, u2);
        Order o3 = new Order(null, Instant.parse("2024-07-15T15:21:22Z"), OrderStatus.SHIPPED, u1);

        Category cat1 = new Category(null, "Electronics");
        Category cat2 = new Category(null, "Books");
        Category cat3 = new Category(null, "Computers");

        Product p1 = new Product(null, "The Lord of the Rings", "Lorem ipsum dolor sit amet, consectetur.", 90.5, "");
        Product p2 = new Product(null, "Smart TV", "Nulla eu imperdiet purus. Maecenas ante.", 2190.0, "");
        Product p3 = new Product(null, "Macbook Pro", "Nam eleifend maximus tortor, at mollis.", 1250.0, "");
        Product p4 = new Product(null, "PC Gamer", "Donec aliquet odio ac rhoncus cursus.", 1200.0, "");
        Product p5 = new Product(null, "Rails for Dummies", "Cras fringilla convallis sem vel faucibus.", 100.99, "");

        userRepository.saveAll(Arrays.asList(u1, u2));
        orderRepository.saveAll(Arrays.asList(o1, o2, o3));
        categoryRepository.saveAll(Arrays.asList(cat1, cat2, cat3));
        productRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5));

        // Optional<Order> obj = orderRepository.findById(1L);
        // System.out.println(obj.get().getOrderStatus() == OrderStatus.PAID);
    }
}

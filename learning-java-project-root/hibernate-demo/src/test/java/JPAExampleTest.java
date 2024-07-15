import org.example.entities.Person;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class JPAExampleTest {

    @BeforeEach
    protected void setUp() {
        // implement JPA entitymanager / entitymanager factory
    }

    @AfterEach
    protected void tearDown() {

    }
    
    @Test
    void savePersonJPA() {
        // try to build the test with JPA specific methods
        // then try to convert it to hibernate but without tight coupling.
    }
}

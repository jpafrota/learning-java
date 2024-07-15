import org.example.entities.Person;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;


public class HibernateExampleTest {

    private SessionFactory sessionFactory;

    @BeforeEach
    protected void setUp() {
        sessionFactory = new Configuration().addAnnotatedClass(Person.class).configure().buildSessionFactory();
    }

    @AfterEach
    protected void tearDown() {
        if (sessionFactory != null) {
            sessionFactory.close();
        }
    }

    @Test
    @Disabled
    void savePerson() {
        sessionFactory.inTransaction(session -> session.persist(new Person(null, "Jorgrasdadgrge", "jpaf@icomp.ufam.edu.br")));
    }

    @Test
    @Disabled
    void findPerson() {
        sessionFactory.inSession(session -> {
            Person p = session.find(Person.class, 1);
            System.out.println(p);
        });
    }

    @Test
    @Disabled
    void deletePerson() {
        sessionFactory.inTransaction(session -> session.remove(new Person(3, null, null)));
    }
}

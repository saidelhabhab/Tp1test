import org.junit.jupiter.api.Test;
import org.said.TpTest.Person;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

public class PersonTest {
    @Test
    void testGetDisplayName() {
        Person person = new Person("Josh", "Hayden", LocalDate.parse("2013-01-12"));
        String displayName = person.getDisplayName();
        assertEquals("Hayden, Josh", displayName);
        System.out.printf(displayName);
    }

    @Test
    void testGetAge() {
        Person person = new Person("Josh", "Hayden", LocalDate.parse("2013-01-12"));
        long age = person.getAge();
        assertEquals(10, age);
    }

}

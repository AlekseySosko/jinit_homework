import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class ContatctTest {
    private static Contact contact;

    @BeforeAll
    public static void createNewContact() {
        contact = new Contact("Иван", 324);
    }

    @Test
    public void equalsShouldReturnTrue() {
        boolean result = contact.equals(new Contact("Иван", 324));

        Assertions.assertTrue(result);
    }
}

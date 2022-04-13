import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

public class PhoneBookTest {
    private static PhoneBook phoneBook;

    @BeforeAll
    public static void createNewPhoneBook() {
        phoneBook = new PhoneBook();
    }

    @Test
    public void contactSearchShouldReturnNull() {
        int number = 321;
        Contact result = phoneBook.contactSearch(number);

        Assertions.assertNull(result);
    }

    @Test
    @Timeout(1)
    public void addGroupShouldReturnFasterThanOneSecond() {
        phoneBook.addGroup("Новая группа");
    }
}

import java.util.Objects;

public class Contact {
    private String name;
    private final int number;

    public Contact(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Contact " + name +
                ", number = " + number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Contact contact = (Contact) o;
        return number == contact.number;
    }

    @Override
    public int hashCode() {
        return Objects.hash(number);
    }
}

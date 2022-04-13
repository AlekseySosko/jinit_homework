import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneBook {
    private Map<String, List<Contact>> mapContact;

    public PhoneBook() {
        mapContact = new HashMap<>();
    }

    public boolean addGroup(String name) {
        if (!mapContact.containsKey(name)) {
            mapContact.put(name, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addContact(Contact contact, String group) {
        if (!mapContact.get(group).contains(contact)) {
            mapContact.get(group).add(contact);
            return true;
        }
        return false;
    }

    public List<Contact> groupSearch(String group) {
        return mapContact.get(group);
    }

    public Contact contactSearch(int number) {
        for (List<Contact> contact : mapContact.values()) {
            for (Contact c : contact) {
                if (number == c.getNumber()) {
                    return c;
                }
            }
        }
        return null;
    }
}

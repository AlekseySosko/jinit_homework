public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addGroup("Семья");
        phoneBook.addGroup("Друзья");
        phoneBook.addGroup("Работа");

        phoneBook.addContact(new Contact("Олег", 25464), "Работа");
        phoneBook.addContact(new Contact("Дима", 6846), "Работа");
        phoneBook.addContact(new Contact("Дима", 6846), "Друзья");
        phoneBook.addContact(new Contact("Юля", 18943), "Работа");
        phoneBook.addContact(new Contact("Юля", 18943), "Семья");

        System.out.println(phoneBook.groupSearch("Работа"));

        System.out.println(phoneBook.contactSearch(18943));
    }
}

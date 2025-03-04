import java.util.HashMap;
import java.util.Map;

public class ContactManager {
    private final Map<String, String> contacts;

    public ContactManager() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
    }

    public boolean removeContact(String name) {
        return contacts.remove(name) != null;
    }

    public String getPhoneNumber(String name) {
        return contacts.get(name);
    }

    public void displayContacts() {
        System.out.println("\nContact List:");
        for (Map.Entry<String, String> entry : contacts.entrySet()) {
            System.out.println("Name: " + entry.getKey() + 
                             ", Phone: " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        ContactManager manager = new ContactManager();
        manager.addContact("Alice Johnson", "555-1234");
        manager.addContact("Bob Smith", "555-5678");
        manager.addContact("Charlie Brown", "555-9012");
        manager.displayContacts();
        System.out.println("\nBob's phone: " + 
            manager.getPhoneNumber("Bob Smith"));
        manager.removeContact("Charlie Brown");
        System.out.println("\nCharlie's phone after removal: " + 
            manager.getPhoneNumber("Charlie Brown"));
        manager.displayContacts();
    }
}
package Address;

//package addressbook;

import java.util.List;

public class ContactView {
    public void displayContact(Contact contact) {
        System.out.println("------ Contact Details ------");
        System.out.println("Name : " + contact.getName());
        System.out.println("Phone: " + contact.getPhoneNumber());
        System.out.println("Email: " + contact.getEmail());
    }

    public void displayAllContacts(List<Contact> contacts) {
        System.out.println("\n=== All Contacts ===");
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact c : contacts) {
                displayContact(c);
                System.out.println("----------------------");
            }
        }
    }

    public void displayMessage(String msg) {
        System.out.println(msg);
    }
}


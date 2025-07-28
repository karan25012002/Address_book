package Address;
//package addressbook;

import java.util.ArrayList;
import java.util.List;

public class ContactController {
    private List<Contact> contactList;
    private ContactView view;

    public ContactController(ContactView view) {
        this.contactList = new ArrayList<>();
        this.view = view;
    }

    public void addContact(String name, String phone, String email) {
        Contact contact = new Contact(name, phone, email);
        contactList.add(contact);
        view.displayMessage("Contact added successfully.");
    }

    public void showAllContacts() {
        view.displayAllContacts(contactList);
    }
}



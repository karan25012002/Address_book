package Address;

//package addressbook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ContactView view = new ContactView();
        ContactController controller = new ContactController(view);

        while (true) {
            System.out.println("\n==== Address Book Menu ====");
            System.out.println("1. Add Contact");
            System.out.println("2. Show All Contacts");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Enter Phone Number: ");
                    String phone = scanner.nextLine();

                    System.out.print("Enter Email: ");
                    String email = scanner.nextLine();

                    controller.addContact(name, phone, email);
                    break;

                case 2:
                    controller.showAllContacts();
                    break;

                case 3:
                    System.out.println("Exiting Address Book.");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}


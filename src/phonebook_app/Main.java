package phonebook_app;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ContactRepository repo = new ContactRepository();
        int nextId = 1;

        while (true) {

            System.out.println("=== PhoneBook ===");
            System.out.println("1. Add Contact");
            System.out.println("2. List Contacts");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.print("> ");

            int command = scanner.nextInt();
            scanner.nextLine(); 

            switch (command) {

                case 1:
                    System.out.print("Name: ");
                    String name = scanner.nextLine();

                    System.out.print("Phone: ");
                    String phone = scanner.nextLine();

                    Contact contact = new Contact(nextId++, name, phone);
                    repo.add(contact);

                    System.out.println("Added!\n");
                    break;

                case 2:
                    System.out.println("--- Contacts ---");
                    for (Contact c : repo.findAll()) {
                        System.out.println("[" + c.getId() + "] "
                                + c.getName() + " - " + c.getPhone());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.print("Delete ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine();

                    repo.delete(id);
                    System.out.println("Deleted");
                    
                    break;

                case 4:
                    System.out.println("Bye");
                    return;
			default:
                    System.out.println("Unknown Command");
            }
            scanner.close();
        }
    }
}

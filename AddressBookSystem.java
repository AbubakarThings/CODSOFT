import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Contact {
    private String name;
    private int age;
    private String phoneNumber;
    private String emailAddress;
    private String city;

    public Contact(String name, int age, String phoneNumber, String emailAddress, String city) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getCity() {
        return city;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Phone: " + phoneNumber + ", Email: " + emailAddress + ", City: " + city;
    }
}

class AddressBook {
    private List<Contact> contacts = new ArrayList<>();

    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    public void removeContact(Contact contact) {
        contacts.remove(contact);
    }

    public List<Contact> searchContact(String keyword) {
        List<Contact> result = new ArrayList<>();
        for (Contact contact : contacts) {
            if (contact.getName().contains(keyword) || contact.getPhoneNumber().contains(keyword) 
            || contact.getEmailAddress().contains(keyword) || contact.getCity().contains(keyword)) {
                result.add(contact);
            }
        }
        return result;
    }

    public void displayAllContacts() {
        if (contacts.isEmpty()) {
            System.out.println("No contacts found.");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    }

public class AddressBookSystem {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("Address Book System Menu:");
            System.out.println("1. Add a new contact");
            System.out.println("2. Remove a contact");
            System.out.println("3. Search for a contact");
            System.out.println("4. Display all contacts");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine();  

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter age: ");
                    int age = sc.nextInt();
                    sc.nextLine();  
                    System.out.print("Enter phone number: ");
                    String phoneNumber = sc.nextLine();
                    System.out.print("Enter email address: ");
                    String emailAddress = sc.nextLine();
                    System.out.print("Enter city: ");
                    String city = sc.nextLine();
                    Contact c = new Contact(name, age, phoneNumber, emailAddress, city);
                    addressBook.addContact(c);
                    break;
                case 2:
                    System.out.print("Enter the name of the contact to remove: ");
                    String removeName = sc.nextLine();
                    List<Contact> contactsToRemove = addressBook.searchContact(removeName);
                    if (!contactsToRemove.isEmpty()) {
                        for (Contact contact : contactsToRemove) {
                            addressBook.removeContact(contact);
                            System.out.println("Removed: " + contact);
                        }
                    } else {
                        System.out.println("Contact not found.");
                    }
                    break;
                case 3:
                    System.out.print("Enter search keyword: ");
                    String searchKeyword = sc.nextLine();
                    List<Contact> searchResults = addressBook.searchContact(searchKeyword);
                    if (!searchResults.isEmpty()) {
                        System.out.println("Search Results:");
                        for (Contact contact : searchResults) {
                            System.out.println(contact);
                        }
                    } else {
                        System.out.println("No matching contacts found.");
                    }
                    break;
                case 4:
                    System.out.println("All Contacts:");
                    addressBook.displayAllContacts();
                    break;
                case 5:
                System.out.println("Exiting Address Book System.");
                sc.close();
                System.exit(0);
                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
                    break;
            }
        }
    }
}

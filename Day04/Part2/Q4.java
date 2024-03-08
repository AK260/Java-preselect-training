/*Write a program to create a directory that contains the following information.
(a) Name of a person
(b) Address
(c) Telephone Number (if available with STD code)
(d) Mobile Number (if available)
(e) Head of the family
(f) Unique ID No.
The program will support the following menu based activities:
(a) Create a database entry (The Unique ID number must be unique for every entry, the telephone numbers of two or more persons can be same if and only if the head of family is same)
(b) Edit an entry (Must be identified by only the Unique ID number)
(c) Search by keyword (Any keyword may not be complete; even if the keyword matches partially with any field, the corresponding information must be displayed)*/


import java.util.ArrayList;
import java.util.Scanner;

class DirectoryEntry {
    private static int uniqueIdCounter = 1000;

    private String name;
    private String address;
    private String telephoneNumber;
    private String mobileNumber;
    private String headOfFamily;
    private int uniqueId;

    public DirectoryEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
        this.uniqueId = uniqueIdCounter++;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public String getHeadOfFamily() {
        return headOfFamily;
    }

    public int getUniqueId() {
        return uniqueId;
    }

    public void displayEntry() {
        System.out.println("Unique ID: " + uniqueId);
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Telephone Number: " + telephoneNumber);
        System.out.println("Mobile Number: " + mobileNumber);
        System.out.println("Head of Family: " + headOfFamily);
        System.out.println();
    }

    public void editEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        this.name = name;
        this.address = address;
        this.telephoneNumber = telephoneNumber;
        this.mobileNumber = mobileNumber;
        this.headOfFamily = headOfFamily;
    }

    public boolean containsKeyword(String keyword) {
        return name.contains(keyword) || address.contains(keyword) ||
               (telephoneNumber != null && telephoneNumber.contains(keyword)) ||
               (mobileNumber != null && mobileNumber.contains(keyword)) ||
               headOfFamily.contains(keyword) ||
               String.valueOf(uniqueId).contains(keyword);
    }
}

public class Q4 {
    private ArrayList<DirectoryEntry> directoryEntries;

    public Directory() {
        this.directoryEntries = new ArrayList<>();
    }

    public void createEntry(String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        DirectoryEntry entry = new DirectoryEntry(name, address, telephoneNumber, mobileNumber, headOfFamily);
        directoryEntries.add(entry);
        System.out.println("Entry created successfully. Unique ID assigned: " + entry.getUniqueId());
    }

    public void editEntry(int uniqueId, String name, String address, String telephoneNumber, String mobileNumber, String headOfFamily) {
        DirectoryEntry entry = getEntryById(uniqueId);
        if (entry != null) {
            entry.editEntry(name, address, telephoneNumber, mobileNumber, headOfFamily);
            System.out.println("Entry edited successfully.");
        } else {
            System.out.println("Entry not found with the given Unique ID.");
        }
    }

    public void searchByKeyword(String keyword) {
        boolean found = false;
        for (DirectoryEntry entry : directoryEntries) {
            if (entry.containsKeyword(keyword)) {
                entry.displayEntry();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No entries found with the given keyword.");
        }
    }

    private DirectoryEntry getEntryById(int uniqueId) {
        for (DirectoryEntry entry : directoryEntries) {
            if (entry.getUniqueId() == uniqueId) {
                return entry;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Directory directory = new Directory();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Create a database entry");
            System.out.println("2. Edit an entry");
            System.out.println("3. Search by keyword");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter address: ");
                    String address = scanner.nextLine();
                    System.out.print("Enter telephone number (if available with STD code): ");
                    String telephoneNumber = scanner.nextLine();
                    System.out.print("Enter mobile number (if available): ");
                    String mobileNumber = scanner.nextLine();
                    System.out.print("Enter head of family: ");
                    String headOfFamily = scanner.nextLine();

                    directory.createEntry(name, address, telephoneNumber, mobileNumber, headOfFamily);
                    break;

                case 2:
                    System.out.print("Enter the Unique ID to edit entry: ");
                    int uniqueIdToEdit = scanner.nextInt();
                    scanner.nextLine();

                    System.out.print("Enter new name: ");
                    String newName = scanner.nextLine();
                    System.out.print("Enter new address: ");
                    String newAddress = scanner.nextLine();
                    System.out.print("Enter new telephone number (if available with STD code): ");
                    String newTelephoneNumber = scanner.nextLine();
                    System.out.print("Enter new mobile number (if available): ");
                    String newMobileNumber = scanner.nextLine();
                    System.out.print("Enter new head of family: ");
                    String newHeadOfFamily = scanner.nextLine();

                    directory.editEntry(uniqueIdToEdit, newName, newAddress, newTelephoneNumber, newMobileNumber, newHeadOfFamily);
                    break;

                case 3:
                    System.out.print("Enter keyword to search: ");
                    String keyword = scanner.nextLine();
                    directory.searchByKeyword(keyword);
                    break;

                case 4:
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please enter a valid option.");
            }
        }
    }
}

package finalexam.task2;

import finalexam.task3.PaperFactory;
import finalexam.task3.Person;
import java.util.Scanner;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nChoose an option:");
            System.out.println("1. Add Person");
            System.out.println("2. Delete Person");
            System.out.println("3. Print Staff");
            System.out.println("4. Save Staff to File");
            System.out.println("5. Load Staff from File");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Enter name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter surname: ");
                    String surname = scanner.nextLine();
                    System.out.print("Enter personal number: ");
                    String personalNumber = scanner.nextLine();
                    Person person = new Person(name, surname, personalNumber);
                    factory.addPerson(person);
                    System.out.println("Person added.");
                    break;
                case 2:
                    System.out.print("Enter personal number of the person to delete: ");
                    String pNumberToDelete = scanner.nextLine();
                    Person personToDelete = factory.findPersonByPersonalNumber(pNumberToDelete);
                    if (personToDelete != null) {
                        factory.deletePerson(personToDelete);
                        System.out.println("Person deleted.");
                    } else {
                        System.out.println("Person not found.");
                    }
                    break;
                case 3:
                    factory.printStaff();
                    break;
                case 4:
                    System.out.print("Enter filename to save staff list: ");
                    String saveFilename = scanner.nextLine();
                    factory.saveStaffToFile(saveFilename);
                    break;
                case 5:
                    System.out.print("Enter filename to load staff list from: ");
                    String loadFilename = scanner.nextLine();
                    factory.loadStaffFromFile(loadFilename);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

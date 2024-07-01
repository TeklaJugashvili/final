package finalexam.task3;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class PaperFactory {
    private List<Person> staff = new ArrayList<>();

    public void addPerson(Person p) {
        staff.add(p);
    }

    public boolean deletePerson(Person p) {
        return staff.remove(p);
    }

    public Person findPersonByPersonalNumber(String personalNumber) {
        for (Person p : staff) {
            if (p.getPersonalNumber().equals(personalNumber)) {
                return p;
            }
        }
        return null;
    }

    public void printStaff() {
        for (Person p : staff) {
            System.out.println(p);
        }
    }

    public void saveStaffToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(staff);
            System.out.println("Staff list saved to " + filename);
        } catch (IOException e) {
            System.err.println("Error saving staff list: " + e.getMessage());
        }
    }

    @SuppressWarnings("unchecked")
    public void loadStaffFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            staff = (List<Person>) ois.readObject();
            System.out.println("Staff list loaded from " + filename);
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error loading staff list: " + e.getMessage());
        }
    }
}

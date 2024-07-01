package finalexam.task2;

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
            if (p.personalNumber.equals(personalNumber)) {
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
}

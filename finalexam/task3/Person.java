package finalexam.task3;

import java.io.Serializable;

public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    private String name, surname, personalNumber;

    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    public String getPersonalNumber() {
        return personalNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Personal Number: " + personalNumber;
    }
}

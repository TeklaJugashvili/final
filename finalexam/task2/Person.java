package finalexam.task2;

public class Person {
    String name, surname, personalNumber;

    public Person(String name, String surname, String personalNumber) {
        this.name = name;
        this.surname = surname;
        this.personalNumber = personalNumber;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Surname: " + surname + ", Personal Number: " + personalNumber;
    }
}

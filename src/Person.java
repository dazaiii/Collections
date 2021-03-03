public class Person {
    String name;
    String surname;

    public Person() {
        name = "";
        surname = "";
    }

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}

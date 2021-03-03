public class Student extends Person implements Printable {
    int journalNumber;

    public Student() {
    }

    public Student(String name, String surname, int journalNumber) {
        super(name, surname);
        this.journalNumber = journalNumber;
    }

    public void print(){
        Person person = new Person(name, surname);
        System.out.println("Student's data:");
        System.out.println("Name: " + person.name + "\nSurname: " + person.surname + "\nJournal number: " + journalNumber);
    }
}

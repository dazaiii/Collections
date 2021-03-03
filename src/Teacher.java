public class Teacher extends Person implements Printable{
    String subject;

    public Teacher(String name, String surname, String subject) {
        super(name, surname);
        this.subject = subject;
    }

    public void print(){
        Person person = new Person(name, surname);
        System.out.println("Teacher's data:");
        System.out.println("Name: " + person.name + "\nSurname: " + person.surname + "\nTeaching subject: " + subject);
    }

}

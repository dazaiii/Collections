import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Student extends Person implements Printable {
    int journalNumber;
    Map<String, List<Integer>> grades = new HashMap<String, List<Integer>>();

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

    public void addGrade(Teacher teacher, int grade){
        String key = teacher.subject;
        if(grades.get(key) == null) {
            grades.put(key, new ArrayList<Integer>());
        }
        grades.get(key).add(grade);
    }

    public void getGrades(Teacher teacher){
        System.out.println(teacher.subject);
        for(List<Integer> i : grades.values()){
            System.out.println(grades.get(teacher.subject) + " ");
        }
    }

    public void deleteGrade(Teacher teacher, int grade){
        String key = teacher.subject;
        ArrayList<Integer> list = (ArrayList<Integer>) grades.get(key);
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) == grade){
                list.remove(i);
                break;
           }
        }
        grades.replace(key, list);
    }
}

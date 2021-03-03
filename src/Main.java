import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Adam", "Nowak", 1);
        Student student2 = new Student("Kleopatra", "Egipska", 2);
        Student student3 = new Student("Joseph", "Joestar", 3);
        Teacher teacher1 = new Teacher("Witold", "Alda", "Math");
        List list1 = new ArrayList();
        List list2 = new ArrayList();
        Class class1 = new Class("1a", list1, teacher1, 30);
        Class class2 = new Class("2a", list2, teacher1, 15);
        class1.addStudent(student1);
        class1.addStudent(student2);
        class1.addStudent(student3);
        class1.summary();
        class1.sortBySurname();
        class1.summary();
        class1.search(student1);
        class1.search("Nowak");
        class1.removeStudent(student1);
        class1.summary();
        class1.searchPartial("star");
        HashMap<String, Class> classes = new HashMap<String, Class>();
        School school1 = new School("Sp1", classes);
        school1.addClass(class1.className, class1);
        school1.addClass(class2.className, class2);
        school1.findEmptyClass();
        school1.schoolSummay();
    }
}

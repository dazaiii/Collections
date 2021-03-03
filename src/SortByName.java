import java.util.Comparator;

public class SortByName implements Comparator<Student> {    //typ comparatora Student
    @Override
    public int compare(Student a, Student b){
        return a.surname.compareTo(b.surname);
    }

}

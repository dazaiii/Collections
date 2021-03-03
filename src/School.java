import java.util.HashMap;

public class School {
    String schoolName;
    HashMap<String, Class> classes = new HashMap<String, Class>();

    public School(String schoolName, HashMap<String, Class> classes) {
        this.schoolName = schoolName;
        this.classes = classes;
    }

    public void addClass(String name, Class class1){
        classes.put(name, class1);
    }

    public void removeClass(String name){
        classes.remove(name);
    }

    public void findEmptyClass(){
        for(String i : classes.keySet()){
            if(classes.get(i).studentsList.isEmpty()){
                System.out.println("Empty classes: " + i);
            }
        }
    }

    public void schoolSummay(){
        System.out.println("Name of school: " + schoolName);
        System.out.println("Classes in school: ");
        for(String i : classes.keySet()){
            System.out.println(i + " ");
            System.out.println("Teacher name: " + classes.get(i).getMainTeacher().name +
                    "\nTeacher surname: " + classes.get(i).getMainTeacher().surname);
            for(int j = 0; j < classes.get(i).studentsList.size(); j++){
                Student student = (Student)classes.get(i).studentsList.get(j);
                System.out.println("Student " + student.journalNumber + ": " + student.name + " " + student.surname);
            }
        }
    }
}

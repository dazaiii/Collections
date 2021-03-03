import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Class {
    String className;
    List studentsList = new ArrayList<>();
    Teacher mainTeacher;
    int maxAmount;
    int amount;

    public Class(String className, List studentsList, Teacher mainTeacher, int maxAmount) {
        this.className = className;
        this.studentsList = studentsList;
        this.mainTeacher = mainTeacher;
        this.maxAmount = maxAmount;
    }

    public Teacher getMainTeacher(){
        return mainTeacher;
    }

    public void addStudent(Student student){
        if(maxAmount > amount){
            amount++;
            studentsList.add(student);
        }
        else {
            System.out.println("Failed to add student because of max amount of students in the class");
        }
    }

    public void removeStudent(Student student){
        studentsList.remove(student);
    }

    public void summary(){
        System.out.println("Information about all students in class " + className);
        for(int i = 0; i < studentsList.size(); i++) {
            Student student = (Student)studentsList.get(i);
            System.out.println("Student " + student.journalNumber + ": " + student.name + " " + student.surname);
        }
    }

    public void sortBySurname(){
        Collections.sort(studentsList, new SortByName());
    }

    public void search(Student student){
        int index = Collections.binarySearch(studentsList, student, new SortByName());
        Student foundStudent =  (Student)studentsList.get(index);
        System.out.println("Found student: " + foundStudent.journalNumber + " " + foundStudent.name + " " + foundStudent.surname);
    }

    public Student search(String surname1) {
        for (int i = 0; i < studentsList.size(); i++) {
            Student foundStudent = (Student) studentsList.get(i);
            if (foundStudent.surname.equals(surname1)) {
                //foundStudent.print();
                System.out.println("Found student: " + foundStudent.journalNumber + " " + foundStudent.name + " " + foundStudent.surname);
                return foundStudent;
            }
        }
        return new Student();
    }

    public Student searchPartial(String string){
        for(int i = 0; i < studentsList.size(); i++){
                Student foundStudent = (Student)studentsList.get(i);
                if(foundStudent.surname.contains(string)) {
                    System.out.println("Found student: " + foundStudent.journalNumber + " " + foundStudent.name + " " + foundStudent.surname);
                    return foundStudent;
                }
            }
        return new Student();
    }

}


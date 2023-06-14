

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import controller.Controller;
import model.Disciples;
import model.Student;
import model.StudyGroup;
import model.Teacher;



public class Main {
    public static void main(String[] args) {
        
        Controller controller = new Controller();

        Teacher Sensei = new Teacher("Van Li", 1968, Disciples.PROGRAMMING);
        Student Kate = new Student("Kate", 1999);
        Student Vasya = new Student("Vasya", 1985);
        Student Kirill = new Student("Kirill", 1932);
        
        List<Student> list1 = new ArrayList<>(Arrays.asList(Kate, Vasya, Kirill));

        StudyGroup group1 = controller.createGroup(list1, Sensei);
        controller.readGroup(group1);
        System.out.println("\n------------------------------------------------\n");
        

        Teacher Subzero = new Teacher("Subzero", 1977, Disciples.LITERATURE);
        Student Ivan = new Student("Ivan", 1991);
        Student Petr = new Student("Petr", 1997);
        Student Dima = new Student("Dima", 1998);
        
        List<Student> list2 = new ArrayList<>(Arrays.asList(Ivan, Petr, Dima));
        
        StudyGroup group2 = controller.createGroup(list2, Subzero);
        controller.readGroup(group2);
        System.out.println("\n------------------------------------------------\n");

        Student Alex = new Student("Alex", 1984);
        controller.addStudentToGroup(group2, Alex);
        controller.readGroup(group2);


    }
}

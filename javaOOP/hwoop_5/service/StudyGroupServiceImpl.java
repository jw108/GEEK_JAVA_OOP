package service;

import java.util.List;

import model.Student;
import model.StudyGroup;
import model.Teacher;

public class StudyGroupServiceImpl {
    
    
    // Teacher teacher;
    // List<Student> studentList;
    
    public StudyGroup createGroup(List<Student> inputList, Teacher teacher) {
        return new StudyGroup(inputList, teacher);
    }

    public void readGroup(StudyGroup group) {
        System.out.println(group.getTeacher());
        for (int i = 0; i < group.getStudentList().size(); i++) {
            System.out.println(group.getStudentList().get(i));
        }
    }

    public StudyGroup addStudentToGroup(StudyGroup group, Student student) {
        group.getStudentList().add(student);
        return group;
    }



}

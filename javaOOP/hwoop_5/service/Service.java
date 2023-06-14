package service;

import java.util.List;

import model.Student;
import model.Teacher;

public interface Service {
    
    public void create(List<Student> inputList, Teacher teacher);

    public void create(Student inputStudent);

    public void read();

}


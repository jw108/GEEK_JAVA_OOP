package model;

public class Student extends User {
    static Integer idGenerator = 0;
    private int studentId;

    public Student(String name, Integer bornDate) {
        super(name, bornDate);
        this.studentId = idGenerator++;
    }

    public int getStudentId() {
        return studentId;
    }

    @Override
    public String toString() {
        return "Студент [Имя = " + name + ", Дата рождения = " +
            BornDate + ", ID студента = " + studentId + "]";
    }

    

}

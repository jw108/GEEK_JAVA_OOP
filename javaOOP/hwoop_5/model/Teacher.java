package model;

public class Teacher extends User {
    static Integer idGenerator = 0;
    private Disciples disciplesTaught;
    private int idTeacher;

    public Teacher(String name, Integer bornDate, Disciples disciples) {
        super(name, bornDate);
        this.disciplesTaught = disciples;
        this.idTeacher = idGenerator++;
    }

    public Disciples getDisciplesTaught() {
        return disciplesTaught;
    }

    @Override
    public String toString() {
        return "Учитель [ID учителя: " + idTeacher + ", Имя = " + name + ", Дата рождения = " +
        BornDate + ", Предмет = " + disciplesTaught + "]";
    }

    
    
}

import java.util.List;

public class TeacherGroup <T extends User> implements Iterable<Teacher> {

    private List<T> teachers;
    private Long teacherGroupId;

    public TeacherGroup(List<T> teachers, long teacherGroupId) {
        this.teachers = teachers;
        this.teacherGroupId = teacherGroupId;
    }

    public void setTeachers(List<T> teachers) {
        this.teachers = teachers;
    }

    public void setTeacherGroupId(Long teacherGroupId) {
        this.teacherGroupId = teacherGroupId;
    }

    public List<T> getTeachers() {
        return teachers;
    }

    public Long getTeacherGroupId() {
        return teacherGroupId;
    }

    @Override
    public TeacherGroupIterator iterator() {
        return new TeacherGroupIterator((TeacherGroup<Teacher>) this);
    }
    
}

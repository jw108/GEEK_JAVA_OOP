import java.time.LocalDate;
import java.util.Iterator;
import java.util.TreeSet;

public class programm {
    public static void main(String[] args) {
        
        // User user1 = new User("Ян", "Янов", "Янович", LocalDate.now());
        // User user2 = new User("Петр", "Петров", "Петрович", LocalDate.now());
        // User user3 = new User("Семен", "Сидоров", "Петрович", LocalDate.now());

        // TreeSet<User> userList = new TreeSet<>(new UserComparator<>());
        // userList.add(user1);
        // userList.add(user2);
        // userList.add(user3);
                
        //System.out.println(userList);

        // Iterator<User> iterator = userList.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        // }

        Teacher teacher1 = new Teacher("Яков", "Яковлев", "Яковлевич", LocalDate.now());
        Teacher teacher2 = new Teacher("Савелий", "Смирнов", "Леонидович", LocalDate.now());
        Teacher teacher3 = new Teacher("Антон", "Денисов", "Николаевич", LocalDate.now());
        Teacher teacher4 = new Teacher("Данил", "Попов", "Алексеевич", LocalDate.now());

        TreeSet<Teacher> teacherList = new TreeSet<>(new TeacherComparator<>());
        teacherList.add(teacher1);
        teacherList.add(teacher2);
        teacherList.add(teacher3);
        teacherList.add(teacher4);

        System.out.println(teacherList);

        Iterator<Teacher> iterator = teacherList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }



    }
}

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class WorkingWithLists {
    @Test
    public void createAndWorkWithLists() {
        Student alex = new Student();
        alex.setFirstName("Alex");
        alex.setLastName("The Tester");
        alex.setEmail("Alex@gtest.com");
        alex.setPhone("+371 25874562");

        Student jana = new Student("Jana", "Ivanova", "jana@gtest.com", "+37125845789");
        Student janis = new Student("Janis", "Ozolins", "janka@gtest.lv", "+37112548567");
        Student liga = new Student("Liga", "Lazdina", "liga.l@gtest.com", "216459856");
        Student pjotr = new Student("Pjotr", "Bobov", "pjotr@gtest.com", "13541643");

        liga.setLastName("Zvaigzne");

        List<Student> students = new ArrayList<>();
        students.add(jana);
        students.add(janis);
        students.add(liga);
        students.add(pjotr);
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i).getFirstName());
        }

        for (Student s : students) {
//            System.out.println(s.getFirstName() + " " + s.getLastName());
            System.out.println(s.getFullName());
        }

        //------------------------FOREACH with IF-------------------------
        System.out.println("Printing students with phone nr starting with +371:");
        for (Student s : students) {
            if (s.getPhone().startsWith("+371")) {
                System.out.println(s.getFullName());
            }
        }
    }
}

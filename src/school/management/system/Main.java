package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Teacher lizzy = new Teacher(1, "lizzy", 500);
        Teacher mellisa = new Teacher(2, "Mellisa", 700);
        Teacher vanderhorn = new Teacher(3, "Vanderhorn", 600);

        List<Teacher> teacherList = new ArrayList<>();
        teacherList.add(lizzy);
        teacherList.add(mellisa);
        teacherList.add(vanderhorn);

        Student tamasha = new Student(1, "Tamasha", 4);
        Student rakshith = new Student(2, "Rakshith", 12);
        Student rabbi = new Student(3, "Rabbi", 5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(tamasha);
        studentList.add(rabbi);
        studentList.add(rakshith);

        School ghs = new School(teacherList,studentList);


        //function for fees spent for tamasha

        tamasha.payFees(5000);
        rakshith.payFees(4050);
        System.out.println("GHS has earned $" + ghs.getTotalMoneyEarned());

        System.out.println("--------------------MAKING SCHOOL PAY SALARY");
        lizzy.receivedSalary(lizzy.getSalary());
        System.out.println("GHS has spent for salary to " + lizzy.getName() + " and has now has " + ghs.getTotalMoneyEarned());

    }
}

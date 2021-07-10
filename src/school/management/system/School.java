package school.management.system;

import java.util.List;

/**
 * Many teacher, many students that school have
 * ArrayList will be created for teachers and students
 */

public class School {

    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    /**
     *
     * @param teachers list of teachers in the school
     * @param students list of students in the school
     */

    public School(List<Teacher> teachers, List<Student> students) {
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }



    /**
     *
     * @return all the information for the teachers and students
     *
     *
     *
     *
     *
     *
     */


    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);

    }

    public List<Student> getStudents() {
        return students;
    }

    public void addStudents(Student student) {
       students.add(student);
    }


    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }


    /**
     * Function used to get the total money earned
     * @param moneyEarned money that is suppodedd to be added
     */



    public static void setTotalMoneyEarned(int moneyEarned) {
       totalMoneyEarned += moneyEarned;
    }


    /**
     *
     * @return the total amount of money that was spent for the school
     */
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }

    /**
     *update the money that is spent by the school
     *
     * @param moneySpent function is for how much money is spent for the school
     */

    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneySpent -= moneySpent;
    }

    public static void updateTotalMoneyEarned(int moneyEarned){
        totalMoneyEarned += moneyEarned;
    }
}

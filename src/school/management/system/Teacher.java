package school.management.system;

/**
 * This class is responsible to keeping track of teachers private information
 */


public class Teacher {


    private int id;
    private String name;
    private int salary;
    private int salaryEarned;


    /**
     * @param id     for the teacher
     * @param name   the name of the teacher
     * @param salary the paid amount that was offer to the teacher
     */

    public Teacher(int id, String name, int salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.salaryEarned = 0;

    }

    /**
     * @return id
     */

    public int getId() {
        return id;
    }

    /**
     * @return teacher name
     */


    public String getName() {
        return name;
    }

    /**
     * @return the salary for the teacher
     */

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }


    public  void receivedSalary(int salary){
        salaryEarned += salary;
        School.updateTotalMoneySpent(salary );

    }


}

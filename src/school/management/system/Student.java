package school.management.system;


//
//Created by Maurice Ruffin on 6/30/2021
//Project is to keep track of students: fees, name, grades and etc


public class Student {

    //    to protect students infomation
    private int id;
    private String name;
    private int grade;
    private int feesPaid;
    private int feesTotal;

    //This method is to keep track of student information
//    fees for every student is the same ($30,000)
//    fee paid initally is 0;
//    @param id
//    @param name
//    @param grade
//

    public Student(int id, String name, int grade) { //arguments in the methods
        this.id = id;
        this.name = name;
        this.grade = grade;
        this.feesPaid = 0;
        this.feesTotal = 30000;

    }

    //Not altering the student's name; student's id.


    // Using updates to update student grades

    public void setGrade(int grade) {
        this.grade = grade;

    }


    /**
     * fees paid is $10,000 + $5000, + $15,0000
     * add the fees to the fees paid
     * the school is going to receive the fees
     * @param fees of the student
     */

    public void payFees(int fees) {
        feesPaid += fees;  //adding fees together
        School.updateTotalMoneyEarned(feesPaid);


    }

    /**
     *
     * @return all the students informations from: id, name, grades, feespaid, total-fees
     */

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeesPaid() {
        return feesPaid;
    }

    public int getFeesTotal() {
        return feesTotal;
    }

    public  int getRemainingFees() {
        return feesTotal-feesPaid;
    }



}

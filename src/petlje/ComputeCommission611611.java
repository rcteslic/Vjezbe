package petlje;

public class ComputeCommission611611 {
 /*   (Financial application: find the sales amount) You have just started a sales job
    in a department store. Your pay consists of a base salary and a commission. The
    base salary is $5,000. The scheme shown below is used to determine the commis-
    sion rate.
    Sales Amount      Commission Rate
    $0.01–$5,000              8 percent
    $5,000.01–$10,000        10 percent
    $10,000.01 and 25000     12 percent

    Note that this is a graduated rate. The rate for the first $5,000 is at 8%, the next
    $5000 is at 10%, and the rest is at 12%. If the sales amount is 25,000, the com-
    mission is 5,000 * 8% + 5,000 * 10% + 15,000 * 12% = 2,700.

    Your goal is to earn $30,000 a year. Write a program that finds the minimum sales
    you have to generate in order to make $30,000.?
    */

    public static void main(String[] args) {
        double amount = 195000;
        double restAmount = amount;
        double fillSalary = 0;
        double commissionRate = 6;
        double goal = 0;

/*
        while (true){
            amount+=0.1;
            commissionRate+=2;
            goal += commissionRate/100 * 5000;

            commissionRate+=2;
            goal+= commissionRate/100 * 5000;

            commissionRate+=2;
            goal+= commissionRate/100 * (amount-10000);

            if(goal>=2700){
                System.out.println("amount = " + amount);
                break;
            }
            goal =0;
            commissionRate =6;

        }

*/

        System.out.println(95000*0.12);
        for (int index = 1; index <= 3; index += 1) {

            if (fillSalary >= 10000 && restAmount > 0) {
                double commForFive = commissionRate / 100 * (restAmount - 10000);
                goal += commForFive;
                System.out.println((fillSalary) + ":  " + (commissionRate += 2) + ":   " + commForFive);
            }

            if (fillSalary < 10000 && restAmount > 0) {
                fillSalary += 5000;
                commissionRate += 2;
                double commForFive = commissionRate / 100 * 5000;
                goal += commForFive;
                System.out.println((fillSalary) + ":  " + (commissionRate) + ":   " + commForFive);
            }

        }

        System.out.println("goal = " + goal);
    }
}

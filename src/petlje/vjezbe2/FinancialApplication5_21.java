package petlje.vjezbe2;

public class FinancialApplication5_21 {
    public static void main(String[] args) {
        double loanAmount = 10000;
        final int NUMBER_OF_YEARS = 5;
        System.out.println("Interest rate     Monthly     Total  ");
        for (double annualInterestRate = 5; annualInterestRate <= 8; annualInterestRate += 0.125) {

            double monthlyInterestRate = annualInterestRate / 1200;

            double monthlyPayment = loanAmount * monthlyInterestRate / (1
                    - 1 / Math.pow(1 + monthlyInterestRate, NUMBER_OF_YEARS * 12));
            System.out.println(annualInterestRate + "      " + monthlyPayment+"    " +(monthlyPayment*NUMBER_OF_YEARS*12));
        }

    }


}


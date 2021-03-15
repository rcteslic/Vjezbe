package stringovi;

import java.util.Scanner;

public class StudentMajorAndStatus4_18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String userInputForMajor = "C";
        int userInputForStatus = 3;

        String major = "";
        String status = "";

        switch (userInputForMajor) {
            case "M":
                major = "Mathematics";
                break;
            case "C":
                major = "Computer Science";
                break;
            case "I":
                major = "Information Technology";
                break;
        }
        switch (userInputForStatus) {
            case 1:
                status = "Freshman";
                break;
            case 2:
                status = "Sophomore";
                break;
            case 3:
                status = "Junior";
                break;
            case 4:
                status = "Senior";
        }

        if (major.equals("") || status.equals("")) {
            System.out.println("Invalid Input");
        } else System.out.println(major + " : " + status);


    }
}



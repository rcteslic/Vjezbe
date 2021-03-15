package stringovi;

public class DaysOfMonth4_17 {
    public static void main(String[] args) {
        int year = 2016;
        int Pyear = 2016;
        String mounth = "Feb";

        int days = 0;

        if (mounth == "Jan" || mounth == "Mart" || mounth == "Maj" ||
                mounth == "Jul" || mounth == "Avg" || mounth == "Okt" || mounth == "Dec") {
            days = 31;
        } else {
            days = 30;
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
                days = 29;
            } else {
                days = 28;
            }
        }


        System.out.println("year " + year + " in mounth " + mounth + " has " + days + " days");

    }
}

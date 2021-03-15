package petlje;

public class ZajednickiKArakteri {
    public static void main(String[] args) {
        String firstString = "Welhcome to C++";
        String secondString = "3Weltcome to programming";
        String commonPrefix = "";
        int duzinaManjegStringa = Math.min(firstString.length(), secondString.length());

        for (int i = 0; i < duzinaManjegStringa; i++) {
            if (firstString.charAt(i) == secondString.charAt(i)) {
                commonPrefix += firstString.charAt(i);
            } else {
                break;
            }
        }
        if (commonPrefix != "") {
            System.out.println("prazan je");
        } else
            System.out.println("commonPrefix = " + commonPrefix);


    }
}

package petlje.domaci;

public class CheckSubstring4_22 {

    public static void main(String[] args) {
        String msg2 = "";
        String msg = "ABC";

        if(msg.equals("") || msg2.equals("")){
            System.out.println("You entered blank msg");
        }

        else if (msg.contains(msg2)) {
            System.out.println(msg2 + " is a substring of " + msg);
        }
        else if (msg2.contains(msg)) {
            System.out.println(msg + " is a substring of " + msg2);
        }
        else System.out.println("Dont have substrings");
    }


}

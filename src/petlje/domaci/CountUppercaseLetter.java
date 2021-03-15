package petlje.domaci;

public class CountUppercaseLetter {
    public static void main(String[] args) {
      /*  '0' to '9' 48 to 57 \u0030 to \u0039
        'A' to 'Z' 65 to 90 \u0041 to \u005A
        'a' to 'z' 97 to 122 \u0061 to \u007A*/
        String msg = "WAlcome to Java";
        int counter = 0;
        for (int index = 0; index < msg.length(); index++) {
            if (msg.charAt(index) >= 65 && msg.charAt(index) <= 90) {
                counter++;
            }
        }
        System.out.println(counter);
    }
}

package stringovi;

public class OrderThreeCities4_24 {
    public static void main(String[] args) {
        String input1 = "Boston";
        String input2 = "Los Angeles";
        String input3 = "Atlanta";
        String tem;

        if (input1.compareTo(input2) > 0) {
            tem = input1;
            input1 = input2;
            input2 = tem;
        }
        if (input1.compareTo(input3) > 0) {
            tem = input1;
            input1 = input3;
            input3 = tem;
        }
        if (input2.compareTo(input3) > 0) {
            tem = input2;
            input2 = input3;
            input3 = tem;
        }


        System.out.println("input1 = " + input1);
        System.out.println("input2 = " + input2);
        System.out.println("input3 = " + input3);

    }
}

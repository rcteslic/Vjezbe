package stringovi;

public class Geometry4_1 {
    public static void main(String[] args) {
        //        5 * s^2
        //Area =  -----------
        //     4 * tan(PI/5)
        //s =  2r sin PI/5

        double r = 5.5;
        double s = 2 * r * Math.sin(Math.PI / 5);
        double area = 5 * Math.pow(s, 2) / (4 * Math.tan(Math.PI / 5));
        System.out.println(Math.round(area * 100) / 100.0);
    }
}

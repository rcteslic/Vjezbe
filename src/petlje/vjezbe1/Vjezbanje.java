package petlje.vjezbe1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Vjezbanje {
    public static void main(String[] args) {
        double suma =0;
        double j =1;
        for(double gornjidio =1; gornjidio<=97; gornjidio+=2){
            double donjiDio = j += 2;
            suma+=(gornjidio/donjiDio);
        }
        System.out.println("suma = " + suma);
    }
    // continue
    // break
    // for petlja
}

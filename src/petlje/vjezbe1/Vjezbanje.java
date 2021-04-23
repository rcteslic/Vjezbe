package petlje.vjezbe1;

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

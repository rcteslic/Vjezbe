package nizovi;

public class MergeArrays {
    public static void main(String[] args) {
        double tezinaPrvogPaketa = 10;
        double cijenaPrvogPaketa = 9;
        System.out.println("Unesite tezinu i cijenu drugog paketa");
        double tezinaDrugogPaketa = 5;
        double cijenaDrugogPaketa = 5;


        if((tezinaPrvogPaketa > tezinaDrugogPaketa) || (cijenaPrvogPaketa < cijenaDrugogPaketa)){
            System.out.println("Isplativiji je Prvi paket");
        }
        if(((tezinaDrugogPaketa > tezinaPrvogPaketa) || (cijenaDrugogPaketa < cijenaPrvogPaketa))){
            System.out.println("Isplativi je drugi paket");
        }
    }
    }

package day13_forloop_nestedforloop;

public class C07_NestedForLoop {
    public static void main(String[] args) {

        //for loop ile 1 2 3 4 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(1*i+" ");
            System.out.print(" ");

        }


        // for loop ile 2 4 6 8 yazdirin

        for (int i = 1; i <=4 ; i++) {
            System.out.print(2*i+" ");}
        System.out.print("");
        // for loop ile 3 6 9 12 yazdirin
        for (int i = 1; i <=4 ; i++) {
            System.out.print(3*i+" ");}
        System.out.print(" ");
        System.out.print("Dikdortgen biciminde konsol ciktisi icin nested for loop kullanilir");

        for (int i = 1; i <=3 ; i++) {//outer forloop,satirlari kontrol eder
            for (int j = 1; j <4 ; j++) {//inner for loop,her satirdaki sutunlari kontrol eder
                System.out.print(i*j+" ");

            }
            System.out.println("");

        }

    }
}

package day48_Maps;

import day47_Maps.OgrenciMapClass;

public class C04_BolumUpdate extends OgrenciMapClass {

    public static void main(String[] args) {

        // istenen bolumdeki tum ogrencilerin,
        // bolum isimlerini yeni verilen bolum ismi olarak degistirin
        // Ornek; MF bolumundeki tum ogrencilerin bolumunu SAY yapin

        mapeOgrenciEkle();

        System.out.println(ogrenciMap);

        bolumDegistir("MF","SAY");

        System.out.println(ogrenciMap);

        bolumDegistir("TM","EA");

        System.out.println(ogrenciMap);



    }
}

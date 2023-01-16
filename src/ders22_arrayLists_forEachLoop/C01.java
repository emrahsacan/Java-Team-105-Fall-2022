package ders22_arrayLists_forEachLoop;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C01 {
    public static void main(String[] args) {

        // Ogretmenden ogrenci notlarini alip bir list olusturun
        // ogretmen 100'den buyuk bir sayi girip, bitirdiginde
        // sinif sayisini, sinif ortalamasini ve kac kisinin ortalamanin
        // ustunde not aldigini yazdirin

        List<Double> notlar=listeOlustur();

        System.out.println(notlar);

        raporla(notlar);


    }
    public static void raporla(List<Double> notlar){

        int ogrenciSayisi=notlar.size();
        double notlarToplami=0.0;
        double sinifNotOrtalamasi=0.0;
        int ortalamaUstundekiOgrenciSayisi =0;

        for (int i = 0; i < notlar.size(); i++) {
            notlarToplami += notlar.get(i);

        }
        sinifNotOrtalamasi=notlarToplami/ogrenciSayisi;

        for (int i = 0; i < notlar.size(); i++) {
            if (notlar.get(i)>sinifNotOrtalamasi){
                ortalamaUstundekiOgrenciSayisi++;
            }

        }
        System.out.println("Girilen not sayisi : " + ogrenciSayisi+
                "\nGirilen notlarin ortalamasi : " + sinifNotOrtalamasi +
                "\nOrtalama üzerinde not alan ögrenci sayisi : " + ortalamaUstundekiOgrenciSayisi);

    }

    public static List<Double> listeOlustur() {

        List<Double> notlar = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        Double girilenNot = 5.0;

        while (girilenNot>0) {

            System.out.println("Lutfen listeye eklemek icin not giriniz" +
                    "\nBitirmek icin 0'ya basin");
            girilenNot = scan.nextDouble();

            if (girilenNot>0) {
                notlar.add(girilenNot);
            }

        }

        return notlar;
    }

}

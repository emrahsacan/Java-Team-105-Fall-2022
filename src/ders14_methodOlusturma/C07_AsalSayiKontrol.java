package ders14_methodOlusturma;

public class C07_AsalSayiKontrol {

    // Soru 3- Kullanicidan main method icinde pozitif bir tamsayi alin.
    // Girilen sayinin asal sayi olup olmadigini kontrol edip,
    // sonuc olarak “asal sayi” veya “asal sayi degil” sonuclarini donduren bir method olusturun.
    public static void main(String[] args) {
        int sayi=515;

        System.out.println(asalSayiKontrolEt(sayi));


    }


    public  static String asalSayiKontrolEt(int sayi){
        String sonuc ="";

        for (int i = 2; i <sayi-1 ; i++) {

            if (sayi%i==0){
                sonuc="asal değil";
                break;

            }

        }
        if (!sonuc.equals("asal değil")){
            sonuc="asal sayi";
        }
        return sonuc;
    }

}

package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan ismini, soyismini ve yasini alip, asagidaki formatta yazdirin.
        //		Isminiz : John
        //		Soyisminiz : Doe
        //		Yasiniz : 44
        //		Kaydiniz basariyla tamamlanmistir.

        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();
        // String icin kullanilabilen next() sadece ilk space'e kadar olan kismi alir
        //                            nextLine() ise o satirda yazilan tum bilgiyi alir

        System.out.println("Lütfen soyisiminizi giriniz");
        String soyIsim = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz");
        double yas = scan.nextDouble();


        System.out.println("İsminiz : "+ isim + "\nSoyisminiz : " + soyIsim +  " \nYaşınız : " + yas + "\nKaydiniz basariyla tamamlanmistir");





    }
}

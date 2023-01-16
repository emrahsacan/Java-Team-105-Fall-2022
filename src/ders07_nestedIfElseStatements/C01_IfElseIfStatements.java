package ders07_nestedIfElseStatements;

import java.util.Scanner;

public class C01_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip vucut kitle endeksini hesaplayin
        // (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan =new Scanner(System.in);

        System.out.println("Lütfen kg olarak kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lütfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        double index=((kilo*10000 / (boy*boy)));
        System.out.println("Vücut kitle indeksiniz : " + index);

        if (index>30){
            System.out.println("Obez");
        } else if ( index>=25){
            System.out.println("kilolu");
        } else if ( index>=20){
            System.out.println("normal");
        }else if (index>0) {
            System.out.println("zayıf");

        } else {
            System.out.println("yanlış giriş");
        }
    }
}

package ders03_dataCastingWrapperClass;

import java.util.Scanner;

public class C03_DataCasting {
    public static void main(String[] args) {

        // Kullanicidan bir tamsayi alin
        // Kullanici kac girerse girsin
        // konsolda -128 ile +127 arasinda bir sonuc yazdiracak
        // kod yaziniz

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen bir sayı giriniz");
        int sayi= scan.nextInt();

        byte donusensayi= (byte)sayi;

        System.out.println("Girdiğiniz " + sayi + "'in dönüşmüş hali:" + donusensayi);

    }
}

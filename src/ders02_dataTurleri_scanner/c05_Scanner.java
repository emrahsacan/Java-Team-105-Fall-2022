package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class c05_Scanner {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir double, bir de int sayi alip
        // bunlarin toplamini ve carpimini yazdirin.

        Scanner scan=new Scanner(System.in);

        System.out.println("lütfen ondalıklı bir sayı giriniz");

        double ondalikliSayi= scan.nextDouble();

        System.out.println("Lütfen bir tam sayi giriniz");

        int tamSayi= scan.nextInt();

        System.out.println("Verilen iki sayının çarpımı : " + (ondalikliSayi*tamSayi));
        System.out.println("Verilen iki sayının toplami : " + (ondalikliSayi+tamSayi));


    }
}

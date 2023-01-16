package ders06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseStatements {
    public static void main(String[] args) {
        // Soru 3- Kullanicidan yasini isteyin, 65 yas ve uzeri ise ”Emekli olabilirsin” yazdirin,
        // yoksa emekli olmasi icin calismasi gereken yil sayisini yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen Yaşınızı giriniz...");
        double yas= scan.nextDouble();


        if (65<=yas){
            System.out.println("Emekli olabilirsin :)");
        } else {
            System.out.println("Emekli olabilmek için " + (65-yas) + " yıl daha çalışmanız gerekmetedir");
        }

    }
}

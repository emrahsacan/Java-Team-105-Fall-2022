package ders37_tekrar;

import java.util.Scanner;

public class C06_tekrar {
    public static void main(String[] args) {
        // Kullanicidan yasini isteyin
        // eger 0 veya negatif bir sayi girerse
        // uyari olaral IllegalArgumentException uyarisi verin
        // ancak kodumuz normal calismaya devam etsin

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yaşını giriniz");
        int yas= scan.nextInt();

        try {
            if (yas<=0){
                throw new IllegalArgumentException();
            }
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
            System.out.println("Yas sifir ya da negatif OLAAMAZ!");
        }

    }


}

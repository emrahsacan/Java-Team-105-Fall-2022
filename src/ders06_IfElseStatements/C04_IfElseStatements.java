package ders06_IfElseStatements;

import java.util.Scanner;

public class C04_IfElseStatements {
    public static void main(String[] args) {

        // Soru 4- Kullanicidan bir karakter girmesini isteyin,
        // girilen karakterin buyuk harf olup olmadigini yazdirin.

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krktr=scan.next().charAt(0);

        if (krktr>='A' && krktr<'Z'){
            System.out.println("Büyük harf girdiniz");
        } else {
            System.out.println("Büyük harf değil");
        }
    }
}

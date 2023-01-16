package ders06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseStatements {
    public static void main(String[] args) {
        // Soru 5- Kullanicidan bir harf isteyin,
        // girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        // yoksa girilen harfi yazdirin

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krktr=scan.next().charAt(0);

        if (krktr>'a' && krktr<'z'){
            // kucuk harf girildi demektir
            System.out.println((char)(krktr-32));
        }else {
            System.out.println(krktr);
        }
    }
}

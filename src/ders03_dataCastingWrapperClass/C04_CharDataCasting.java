package ders03_dataCastingWrapperClass;

import java.util.Scanner;

public class C04_CharDataCasting {

    public static void main(String[] args) {

        System.out.println('a' + 'b');// 97 98 = 195

        // kullanicidan char bir karakter alin
        // o karakterden sonra gelen 3 karakteri yazdirin
        // ornek input : a , output : bcd

        System.out.println("Lütfen bir karakter giriniz");

        Scanner scan = new Scanner(System.in);

        char girilenkarakter = scan.next().charAt(0);

        System.out.println(""+(char)(girilenkarakter+1) +(char)(girilenkarakter+2)+(char)(girilenkarakter+3));





    }
}

package ders15_overloading_whileLoop;


import java.util.Scanner;

public class C06_WhileLoop {
    public static void main(String[] args) {

        /*
        Soru : Kullanicidan sifre isteyin asagidaki sartlari saglamayan sifrelerde hatalari yazdirip,
        kullanicinin yeni sifre girmesi isteyin
        Gecerli bir sifre yazilincaya kadar bu islemi tekrar edin
        gecerli sifre yazilinca “sifreniz basari ile kaydedildi” yazdirin
        sartlar :
        - sifrenin ilk karakteri kucuk harf olmali
        - sifrenin son karakteri rakam olmali
        - sifre en az 8 basamakli olmali
         */

        Scanner scan =new Scanner(System.in);
        boolean sifreGecerliMi=false;
        String sifre="";
        int bayrak = 0;

        while (!(sifreGecerliMi==true)){
            System.out.println("Lütfen şifrenizi giriniz : ");
            sifre = scan.nextLine();

            if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z'))  {
                System.out.println("Şifrenizin ilk karakteri küçük harf olmalı!");
                bayrak ++;
            }
            if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
                System.out.println("Şifrenizin son karakteri rakam olmalıdır!");
                bayrak++;
            }
            if (sifre.length()<8){
                System.out.println("Şifreniz en az 8 basamakli olmali!");
                bayrak++;

            }
            if(bayrak==0){
                sifreGecerliMi=true;
                System.out.println("Şifreniz başarıyla kaydedilmiştir");

            }

        }

    }
}

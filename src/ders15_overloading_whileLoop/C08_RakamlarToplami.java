package ders15_overloading_whileLoop;

public class C08_RakamlarToplami {
    public static void main(String[] args) {
        // Soru 2- While loop kullanarak kullanicidan alinan sayinin rakamlar toplamini bulun.

        int sayi = 1453;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        while (sayi!=0){
            birlerBasamagi=sayi%10;
            rakamlarToplami+=birlerBasamagi;
            sayi/=10; // bunu yaparak son basamagı kaldırmış oluyoruz ve yukarı çıkıyor 1453/10= 145 oluyor
            // sonra tekrar döngüye girip birler basamağı toplama işlemine giriyor.

        }
        System.out.println(rakamlarToplami);


    }
}

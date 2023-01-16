package ders12_forLoops;

public class C04_RakamlarToplami {
    public static void main(String[] args) {

        // kullanicinin verdigi sayinin rakamlar toplamini bulun

        long sayi= 43011238841L;// long olarak kabul etmesi için
                                // sonuna L veya l yazılır
        String sayiStr=""+sayi; // integer sayıyı Stringe çeviririz ki aşağıdaki
                               // length uygulamasını yapabilelim

        long birlerBasamagi=0;
        long rakamlarToplami=0;


        for (int i = 1; i <=sayiStr.length() ; i++) {

            birlerBasamagi=sayi%10;
            rakamlarToplami = rakamlarToplami+birlerBasamagi;
            sayi=sayi/10;

        }
        System.out.println(rakamlarToplami);
    }
}

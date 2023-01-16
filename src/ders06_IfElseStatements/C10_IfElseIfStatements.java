package ders06_IfElseStatements;

public class C10_IfElseIfStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, //
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet= 'k';
        int yas= 18;

        if (cinsiyet=='e'&& yas>=65){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='e' && yas<65 && yas>15) {
            System.out.println((65-yas) + " yıl kadar çalışmalısın");
        } else if (cinsiyet=='k'&& yas>=60){
            System.out.println("emekli olabilirsin");
        } else if (cinsiyet=='k' && yas<60 && yas>15) {
            System.out.println((60-yas) + " yıl daha çalışmalısın");
        } else {
            System.out.println("Geçersiz giriş yaptınız");
        }
    }
}

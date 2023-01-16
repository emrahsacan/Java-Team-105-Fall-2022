package ders07_nestedIfElseStatements;

public class C03_NestedIfElseStatements {
    public static void main(String[] args) {
        // Soru 1- Kullanicidan cinsiyetini ve yasini alin, Kadin, 60 yas ve uzeri ,
        // Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak
        // “Emekli olabilirsin” veya “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        char cinsiyet= 'k';
        int yas=14;

        // nested if-else seklinde kullanim icin once ana degiskeni secip
        // ona gore ana yapiyi olusturalim
        // cinsiyet ana degisken olsun

        if (cinsiyet=='K' || cinsiyet=='k'){
            // giris yapilan deger bir kadina ait demektir
            if ( yas<15 ){
                System.out.println("Hatali yas girisi. Bu yaşta çalışamazsın");
            } else if ( yas<60 ){
                System.out.println("Emekli olmak için : " + (60-yas)  + " yıl daha çalışman gerekiyor. Ha gayret :))");
            } else {
                System.out.println("Emekli olabilirsin");
            }
            // satır 19-25 arası 17. if'in nested'ıdır
        } else if (cinsiyet=='e' || cinsiyet=='E'){
            // giris yapilan deger bir erkege ait
            if (yas<15){
                System.out.println("Hatali yas girisi. Bu yaşta çalışamazsın");
            } else if (yas<65) {
                System.out.println("Emekli olamazsin, daha " +(65-yas) +" yil calismalisin. ha gayret :))");
            }else {
                System.out.println("Emekli olabilirsin");
            }

        }else{
            System.out.println("Yanlis cinsiyet girisi");
        }

    }
}

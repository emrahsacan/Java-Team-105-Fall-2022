package ders26_passByvalue_immutableClasses;

public class C07 {
    public static void main(String[] args) {

        String str= "Java Candir";

        str=str.toUpperCase();

        System.out.println(str); // JAVA CANDİR

        /*
        Immutable class'lardan olusturulan bir objenin degeri DEGISTIRILEMEZ
        Eger atama yaparsak java degerini degistirmez
        bunun yerine yeni bir obje olusturur,
        ve bu yeni objeye yeni atadiginiz degeri atar
        eski obje bosa cikar ve garbage collector(Çöp toplayıcı) tarafindan silinmeyi bekler
         */

    }
}

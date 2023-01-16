package ders29_stringBuilder_accsessModifier;

public class C02_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");

        System.out.println(sb1.reverse()); // ridnaC avaJ

        System.out.println("Tersini yazdirdiktan sonra sb1 : " + sb1);

        System.out.println(sb1.insert(0, ".")); // .ridnaC avaJ
        System.out.println(sb1); // .ridnaC avaJ

        sb1.reverse();

        StringBuilder sb2= new StringBuilder("Java Candir.");
        String str= "Java Candir.";

        System.out.println(sb1==sb2); // false  içerik aynı olsa bile false verir
        System.out.println(sb1==sb1); // true sadece bir sb kendisi ile karşılaştirilirsa true verir
        // System.out.println(sb1==str); farklı iki data türü == ile karşilaştirilamaz

        System.out.println(sb1.equals(sb2)); // içerik aynı olsa bile false verir
        System.out.println(sb1.equals(sb1)); // true sadece bir sb kendisi ile karşilaştirilirsa true verir
        System.out.println(sb1.equals(str)); // false  CTE vermez fakat sonuc her zaman false'dur

        System.out.println(sb1.compareTo(sb2)); // 0
        StringBuilder sb3= new StringBuilder("JaKa Kandir");
        System.out.println(sb1.compareTo(sb3)); // 2

        /*
        CompareTo sadece tamamen aynı mı yoksa farklı mı sorusunun cevabını verir.
         Tamamen aynı ise ==> 0 döner.
        Farklılık varsa ==> ilk farklı harfi bulduğunda, farklı harflerin arasında kaç harf olduğunu verir

         */


    }
}

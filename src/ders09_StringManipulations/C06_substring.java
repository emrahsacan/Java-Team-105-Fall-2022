package ders09_StringManipulations;

public class C06_substring {
    public static void main(String[] args) {

        String str = "Java ogren, isi kap";

        System.out.println(str.substring(5)); // ogren, isi kap
        System.out.println(str.substring(0));// Java ogren, isi kap

        System.out.println(str.length()); // 19

        // son karakteri String olarak kaydedin

        String  sonHarf = "" + str.charAt(str.length()-1);// string olarak alma yöntemi

        sonHarf= str.substring(str.length()-1); // son harfi String olarak böyle de alınabilir

        System.out.println(sonHarf);// p

        // son indexteki karakteri upper case olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase());// P

        // son 3 harfi buyuk harf olarak yazdirin

        System.out.println(str.substring(str.length()-3).toUpperCase());// KAP





    }
}

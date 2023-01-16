package ders09_StringManipulations;

public class C04_charAt {
    public static void main(String[] args) {
        String str= "Java Candır";

        System.out.println(str.charAt(0));// ilk harf verir

        System.out.println(str.charAt(5));// 5. index'deki char'i verir

        System.out.println(str.charAt(5));// bana sonuncu karakteri yazdirin r

        /*
          bir metindeki karakter sayisi ile son index arasinda 1 fark vardir
          bu metin icin  karakter sayisi 11
                         son index 10 dur.
         */

        // System.out.println(str.charAt(11)); // StringIndexOutOfBoundsException--(11. index olmadığından böyle çıkş yazar


    }
}

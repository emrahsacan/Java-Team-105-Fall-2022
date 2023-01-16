package ders09_StringManipulations;

public class C07_substring {
    public static void main(String[] args) {
        String str = "Java gun gectikce guzellesiyor";

        System.out.println(str.substring(5, 8));// gun

        //5. indexten başlar (8-5) karakter yazdırır
        // 5. index dahil(inclusive) , 8. index haric(exclusive)

        //gectikce yazdırın
        System.out.println(str.substring(9,17));//gectikce

        System.out.println(str.substring(3,7)); // a gu

        String isim= "huseYIN";

        // Verilen ismi ilk harfi buyuk, geriye kalanı küçük olarak kaydedin

        isim=isim.substring(0,1).toUpperCase()+            // ilk harfi alip buyuk harf yaptik
                isim.substring(1).toLowerCase(); // 1.index ve sonrasini alip kucuk harf yaptik

        System.out.println(isim); // Huseyın

        System.out.println(isim.substring(2,5)); // sey

        // sadece 3. indexdeki harfi yazdirin e

        System.out.println(isim.substring(3,4));// e

        System.out.println("zor sorunun cevabi"+ isim.substring(2,2)); // "" hiçlik


        // System.out.println(isim.substring(5,2)); // StringIndexOutOfBoundsException

    }
}

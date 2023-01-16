package ders28_varargs_stringBuilder;

public class C01 {
    public static void main(String[] args) {
        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);
    }

    private static void topla(int sayi1, int sayi2, int sayi3, int sayi4) {
        System.out.println("4 sayının toplami : " + (sayi1+sayi2+sayi3+sayi4));
    }

    private static void topla(int sayi1, int sayi2, int sayi3) {
        System.out.println("3 sayının toplami : " + (sayi1+sayi2+sayi3));
    }

    public static void topla(int sayi1, int sayi2){
        System.out.println("2 sayının toplami : " + (sayi1+sayi2));

    }
}

package ders29_stringBuilder_accsessModifier;

public class C04 {

        String isim="Ali"; // accsess modifier

        //default: int sayi=10;

    private static  int sayi=10;

    public static void main(String[] args) {

        System.out.println(sayi);//10
        sayi=20;
        System.out.println(sayi);//20

    }
}

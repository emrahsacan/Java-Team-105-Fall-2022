package ders29_stringBuilder_accsessModifier;

public class C05 {
    public static void main(String[] args) {
        C04 obj= new C04();

        obj.isim="Tugay";
        System.out.println(obj.isim); //Tugay
        // obj.sayi=20; private variable'lara baska class dan ulaşılamaz


        C04 obj2=new C04();
        System.out.println(obj2.isim); //Ali
    }
}

package ders29_stringBuilder_accsessModifier;

public class C02 {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java Candir");
        System.out.println(sb1.reverse()); //ridnaC avaJ


        System.out.println( " tersten sonra : " + sb1);

        System.out.println(sb1.insert(0,".")); //.ridnaC avaJ

        System.out.println(sb1);////.ridnaC avaJ

        sb1.reverse();


        StringBuilder sb2=new StringBuilder("Java Candir.");
        String str="Java Candir.";

        System.out.println(sb1==sb2);// false
        System.out.println(sb1==sb1); // true

        System.out.println(sb1.equals(sb2));// içerik aynı olsa bile false verir
        System.out.println(sb1.equals(sb1));// true sadece sb kendisi ile karşılaştırılırsa true verir
        System.out.println(sb1.equals(str));// false cte vermez ama sonuç hep false'der

        System.out.println(sb1.compareTo(sb2)); // 0
        StringBuilder sb3= new StringBuilder("Hava Candir");
        System.out.println(sb1.compareTo(sb3));//2

    }
}

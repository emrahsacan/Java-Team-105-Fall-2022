package ders28_varargs_stringBuilder;

public class C05 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java Candir.");

        System.out.println(sb.capacity());//16+12
        System.out.println(sb.length()); // 12

        System.out.println(sb.reverse()); // .ridnaC avaJ

        sb.reverse();

        sb.replace(0,4,"Ahmet Hoca");

        System.out.println(sb);// Ahmet Hoca Candir.

        sb.insert(18,"Bu bir yalandir");

        System.out.println(sb);

        String str= "Java Çok Güzel";

        sb.insert(21,str,9,14);
        System.out.println(sb); // Ahmet Hoca Candir.Bu Güzelbir yalandir



    }
}

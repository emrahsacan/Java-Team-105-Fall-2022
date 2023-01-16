package ders29_stringBuilder_accsessModifier;

public class C03 {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4));//  ne kadar guzel

        System.out.println(sb);

        // sb=sb.substring(0,4); eşitliğin solu StrinBuilder , saği ise String
        //                       Java non -primitive datalarda casting yapmaz
        // Ayni not Integer , Byte ve Short gibi sayi barindiran non primitive ler için de geçerlidir


        // sb  guzel kelimesi içeriyor mu?
        /*
        StrinBuilder'da olamayan String classinda
         */

        System.out.println(sb.toString().contains("guzel")); // true

        sb.setCharAt(5,'N');
        System.out.println(sb);// Java Ne kadar guzel


    }
}

package ders29_stringBuilder_accsessModifier;

public class C03_StringBuilder {
    public static void main(String[] args) {

        StringBuilder sb= new StringBuilder("Java ne kadar guzel");

        System.out.println(sb.substring(4)); //  ne kadar guzel

        System.out.println(sb); // Java ne kadar guzel

        // sb=sb.substring(0,4);
    }
}

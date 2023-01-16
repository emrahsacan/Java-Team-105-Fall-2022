package ders09_StringManipulations;

import java.util.Locale;

public class C01_toUpperCase {
    public static void main(String[] args) {


        String str="Java Mutluluktur";
        System.out.println(str.toUpperCase());//JAVA MUTLULUKTUR
        System.out.println(str);//Java Mutluluktur

        str= str.toUpperCase();

        System.out.println(str);//JAVA MUTLULUKTUR

        str= "ince Mehmet";

        str= str.toUpperCase();
        System.out.println(str);//İNCE MEHMET

        //str= str.toLowerCase();
        //System.out.println(str);//ince mehmet

        System.out.println(str.toLowerCase(Locale.CHINA));
        System.out.println(str.toLowerCase(Locale.forLanguageTag("Tr")));// ınce mehmet





    }
}

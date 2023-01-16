package ders26_passByvalue_immutableClasses;

import java.util.ArrayList;
import java.util.List;

public class C06 {

    public static void main(String[] args) {
        String str = "Java guzeldir";
        System.out.println(str.toUpperCase()); // JAVA GUZELDİR

        System.out.println(str); // Java guzeldir

        str.toLowerCase();
        System.out.println(str); // Java guzeldir

        List<String> harfler= new ArrayList<>();

        harfler.add("A");
        harfler.add("B");
        harfler.remove(0);

        System.out.println(harfler); //   [B]

        // List ve Array mutable olduklari icin method ile yapilan degisiklikler kalici olur


    }
}

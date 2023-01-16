package ders29_stringBuilder_accsessModifier;

import java.util.ArrayList;
import java.util.List;

public class C06_Encapsulation {
    //

    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();

        sayilar.add(2);
        sayilar.add(3);
        sayilar.add(5);


        // sayilar.get(1)=10; get okumaya izin var ama değer atamaya(yazmaya) izin yok

        // System.out.println(sayilar.set(1));  set varsa MUTLAKA deger atamalısın

    }
}

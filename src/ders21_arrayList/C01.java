package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C01 {
    public static void main(String[] args) {
        List<Integer> sayilar= new ArrayList<>();
        System.out.println(sayilar);

        System.out.println(sayilar.add(10));

        System.out.println(sayilar);
        sayilar.add(20);

        System.out.println(sayilar);

        sayilar.add(1,15);
        System.out.println(sayilar);

        sayilar.add(0,44);
        System.out.println(sayilar);


        List<Integer> eklenecekListe=new ArrayList<>();
        eklenecekListe.add(3);
        eklenecekListe.add(5);


        sayilar.addAll(eklenecekListe);

        System.out.println(sayilar);

        sayilar.addAll(1,eklenecekListe);
        System.out.println(sayilar);



    }
}

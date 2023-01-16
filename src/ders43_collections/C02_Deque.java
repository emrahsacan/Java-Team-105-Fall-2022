package ders43_collections;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class C02_Deque {
    public static void main(String[] args) {

        Deque<String> urunler= new LinkedList<>();

        urunler.add("Nutella");
        urunler.add("Çikolatalı Gofret");
        urunler.add("Çokoprens");

        // Tüm ürünlerin başına "Y " ekleyelim

       String eleman="";
       Deque geciciDeque=new LinkedList();

       while (eleman!=null) {

           eleman = urunler.poll(); // poll methodu ilk elemnti silip bize döndürüyor
           if (eleman != null) {
               eleman = "Y " + eleman;
               geciciDeque.add(eleman);

           }

       }
       urunler=geciciDeque;
        System.out.println(urunler); //[Y Nutella, Y Çikolatalı Gofret, Y Çokoprens]

    }

}

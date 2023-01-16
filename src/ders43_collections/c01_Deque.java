package ders43_collections;

import java.util.Deque;
import java.util.LinkedList;

public class c01_Deque {
    public static void main(String[] args) {

        Deque<String> dq1=new LinkedList<>();

        dq1.add("K");
        dq1.add("B");// [K, B]
        dq1.addLast("F");//[K, B, F]
        dq1.addFirst("A"); //[A, K, B, F]

        System.out.println(dq1.getFirst());//A
        System.out.println(dq1.getLast()); //F

        System.out.println(dq1.remove());//A
        System.out.println(dq1.poll());//K
        System.out.println(dq1.removeLast());// F
        System.out.println(dq1.remove());// B artik deque bos

        // dq1.remove(); //NoSuchElementException
        System.out.println(dq1.poll()); // null

        dq1.add("K");
        dq1.add("B"); //[K, B]

        dq1.push("F");// [F, K, B]


        System.out.println("pop:" + dq1.pop()); // pop:F
        // ilk elementi siler ve bize dondurur removeFirst() ile aynı işlevi görür

        System.out.println(dq1.element());// ilk elementi silmeden bize döndürür
        // Bos deque'de calisirsa exeption firlatir

        System.out.println(dq1.peek());


        System.out.println(dq1);



    }
}

package ders43_collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C03_Set {
    public static void main(String[] args) {
        // verilen bir array'in tekrar eden eementlerini silip
        // her elementin sadece 1 kere kullanildiği hale getirin

        int [] arr= {6,4,3,2,6,8,7,4,1,8,9,5,9,4,2,9,6,3};

        Set<Integer> geciciSet= new HashSet<>();

        for (Integer each: arr
             ){
            geciciSet.add(each);
        }
        int [] geciciArr=new int[geciciSet.size()]; // yeni ve bos bir array var

        // Set'deki benzersiz hale getirilen elementleri geciciArr'ye tasiyalim

        int index=0;
        for (Integer each:geciciSet
             ) {
            geciciArr[index]=each;
            index++;
        }
        // tekrarsız değerleri gecici arr'e tasidik
        // simdi kendi array'imize bu geçici arr değerini atayalim
        arr= geciciArr;
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 4, 5, 6, 7, 8, 9]

    }
}

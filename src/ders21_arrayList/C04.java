package ders21_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C04 {
    public static void main(String[] args) {

        int[] arr = {1,2,4,3,5,3,5,2,5,1,2,4,5,3,4,5};


        List<Integer> tekrarsizListe=new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!tekrarsizListe.contains(arr[i])) {

                tekrarsizListe.add(arr[i]);

            }
        }
        System.out.println("Tekrarsız liste : " + tekrarsizListe);

        arr=new  int[tekrarsizListe.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i]=tekrarsizListe.get(i);

        }

        System.out.println("Array'in tekrarsız hali : " + Arrays.toString(arr));

    }
}

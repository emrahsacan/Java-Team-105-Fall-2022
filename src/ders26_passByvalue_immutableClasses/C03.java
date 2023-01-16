package ders26_passByvalue_immutableClasses;

import java.util.Arrays;

public class C03 {
    public static void main(String[] args) {
        // verilen bir array'in elementlerini 5 artirip
        // sonra yazdiran bir method olusturun
        int[] arr={3,4,5};
        elementeleri5Artir(arr);
        elementeleri5Artir(arr);
        elementeleri5Artir(arr);

        System.out.println("method call dan sonra main method içinde arr : " + Arrays.toString(arr));

    }
    public static void elementeleri5Artir(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i]= arr[i]+5;

        }
        System.out.println(Arrays.toString(arr));

    }
}

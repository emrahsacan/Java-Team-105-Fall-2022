package ders20_multiDimensionalArrays;

public class C04 {
    public static void main(String[] args) {

        // Verilen iki katli bir int array'deki cift sayi adedini bulan kod yaziniz

        int[][] arr= {{4,6},{3,5,8},{1,0,4}};

        int sayac=0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j] %2 == 0){
                    sayac++;
                }
            }
        }
        if (sayac==0){
            System.out.println("Array'de çift sayi yok");

        } else {
            System.out.println("Array'de çift sayi adedi : " + sayac);

        }

    }
}


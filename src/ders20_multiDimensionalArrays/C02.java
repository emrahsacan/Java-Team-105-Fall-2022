package ders20_multiDimensionalArrays;

public class C02 {
    public static void main(String[] args) {
        int[] arr1 ={3,5,7,8};

        int toplam=0;

        for (int i = 0; i <arr1.length ; i++) {
            toplam+= arr1[1];

        }
        System.out.println("Tek katlı elementler toplamı : " + toplam);

        int[][] arr = {{1,2},{3,4,5},{7}};
        // elementleri topla
        toplam=0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                toplam+=arr[i][j];

            }

        }
        System.out.println("İki katlı array'in elementleri toplamı : " + toplam);
    }
}

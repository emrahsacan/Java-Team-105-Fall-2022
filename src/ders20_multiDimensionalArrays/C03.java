package ders20_multiDimensionalArrays;

public class C03 {
    public static void main(String[] args) {


        // Verilen multi dimensional String bir array'deki
        // en uzun String'i bulan kod yaziniz

        String[][] arr = {{"Ilker", "Nesrin"}, {"Hasan", "Heysem", "Adem", "Yusuf Enes"}};

        String enUzunkelime = arr[0][0];

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                if (arr[i][j].length() >= enUzunkelime.length()) {

                    enUzunkelime = arr[i][j];

                }

            }


        }

        System.out.println("en uzun kelime : " + enUzunkelime);
    }
}

package ders25_staticKeyword;



public class C04 {
    public static void main(String[] args) {

        double fiyat=100;
        System.out.println(indirimmUygula(fiyat));//90

        System.out.println(fiyat);
    }

    public static double indirimmUygula(double fiyat) {


        fiyat = fiyat* 0.9;
        return fiyat;

    }


}

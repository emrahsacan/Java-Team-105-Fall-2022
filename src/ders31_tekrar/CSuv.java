package ders31_tekrar;

public class CSuv extends BinekArac{
    public static void main(String[] args) {

        CSuv suv1=new CSuv();
        System.out.println(suv1.marka);// Binek aracların markasi vardir
        System.out.println(suv1.model);//Binek araçların modeli olur
        System.out.println(suv1.motor);//Tum araçlar içten yanmalı motor kullanır
        System.out.println(suv1.plaka);//Tum aracların plakası olur
        System.out.println(suv1.yakit);//Araçlar farkli yakitlar kullanır
        System.out.println(suv1.yil);//1900
        suv1.hiz("benzin"); //binek aracların hizi modele göre değişir
        suv1.teker(); //binek araclarin 4 tekeri olur

        CSuv suv2= new CSuv();
        suv2.marka="Toyota";
        suv2.model="Rav4";
        suv2.motor="1.6";
        suv2.plaka="06 ANK 006";
        suv2.yakit="benzin";
        suv2.yil=2022;
        suv2.hiz(suv2.yakit);



    }
    public void hiz(String yakit){
        if (yakit.equalsIgnoreCase("benzin")){
            System.out.println("Benzinli SUV'ler max 260 km hız yapar");
        } else if (yakit.equalsIgnoreCase("Dizel")) {
            System.out.println("Dizel SUV'ler max 240 km hiz yapar");
        } else if (yakit.equalsIgnoreCase("hibrit")) {
            System.out.println("Hibrit SUV'ler max 220 km hiz yapar");

        } else {
            System.out.println("Yakit belli değil, max hız soyleyemem ");
        }
    }
}

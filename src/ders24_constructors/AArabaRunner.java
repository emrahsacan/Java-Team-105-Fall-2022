package ders24_constructors;

public class AArabaRunner {
    public static void main(String[] args) {

        Aaraba arb1=new Aaraba();

        arb1.marka="Citroen";
        arb1.model="C3";
        arb1.yakit="Benzin";
        arb1.yil=2020;
        arb1.fiyat=20000;

        System.out.println(arb1);

        Aaraba arb2=new Aaraba("volvo","Cx60");

        System.out.println(arb2);

        Aaraba arb3=new Aaraba("hundai","i10",10000);
        System.out.println(arb3);

        Aaraba arb4= new Aaraba("Porche","cayyanne","lpg",1990,12000);

        System.out.println(arb4);
    }
}

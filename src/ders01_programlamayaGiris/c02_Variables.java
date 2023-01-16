package ders01_programlamayaGiris;

public class c02_Variables {

    public static void main(String[] args) {


        int sayi= 111;

        System.out.println("Hello Java");

        System.out.println(sayi);//111

        /*
        java'da iki türlü yazdırma yapabiliriz eğer çift tırnak
        içinde bir bilgi yazdırırsak java ne yazmışsak aynen konsolda
        yazdırır ancak çift tırnak " " içerisinde olmayan bir şey
        görürse onun yazdırılacak bir metin değil bir değer taşıyan veriable
         olduğunu anlar hafızada o variable için ayırdığı bölüme gider
         o bölümde hangi değer varsa onu yazdırır.
         */

        int not;

        not=50;


        System.out.println(not);

        not=70;

        System.out.println(not);//70

        int not2= 60;

        not2= not2 + 10;

        double bankadakiParam = 1000;

        bankadakiParam= bankadakiParam + 100;
        bankadakiParam= bankadakiParam - 200;

        System.out.println(bankadakiParam);


    }
}

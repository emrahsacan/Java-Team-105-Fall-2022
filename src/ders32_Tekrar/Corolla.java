package ders32_Tekrar;

public class Corolla extends BToyota{
    Corolla(int pc){
        super(5);
        System.out.println("Parametreli Corolla constructor");

    }
    Corolla(){

    }
    Corolla(String str){
        this();
        System.out.println("String parametreli Corolla constructor");
    }

    public static void main(String[] args) {

        Corolla corolla3=new Corolla("İlker");
        //Parametresiz Araba constructor
        //Parametresiz Toyota constructor
        //String parametreli Corolla constructor



        System.out.println("============");

        Corolla corolla1=new Corolla();
        //Parametresiz Araba constructor
        //arametresiz Toyota constructor

        System.out.println("===========");

        Corolla corolla2=new Corolla(3);
        //Parametresiz Araba constructor
        //Parametreli Toyota constructor
        //Parametreli Corolla constructor


    }
}

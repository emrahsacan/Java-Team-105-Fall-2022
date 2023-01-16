package ders34_tekrar;

public class BChild extends Aparent{
    public void method1(){
        System.out.println("Child class method1");

    }
    public void method2(int a){
        // overriding olabilmesi için
        // hem method ismi, hem de signature ayni olmalıdır
        // method signature'i = methodun ismi, parametre sayısı
        // ve parametrelerin data türleri
        System.out.println("child class method2");
    }
    public void method2(String isim){
        System.out.println("Child class String parametreli method2");
    }

    @Override
    public void method3() {
        // super.method3();
        // Overriding varsa parent ve child class'daki
        // overridden ve overriding method'lardan sadece biri calisir
        // eger ikisini birden calistirmak isterseniz
        // super.overriddenMethodIsmi yazilir

        /*
           Overriding method @Override notasyonu ile isaretlenebilir
           @Override kullanilmayan overriding isleminde,
           parent class'daki overridden method silinirse
           hic bir sorun olmaz
           Ancak @Override kullanilan overriding isleminde,
           parent class'daki overridden method silinirse
           veya signature'i degistirilirse
           Java CTE verir, boylece overridden method'un
           silinmesi engellenir.
         */
    }
}

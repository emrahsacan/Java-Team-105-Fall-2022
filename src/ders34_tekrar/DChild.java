package ders34_tekrar;

public class DChild extends CParent{
    // overriding kurallari
    // 1- access modifier method signature'a dahil olmadığından
    // overridden ve overriding access modifier'lar(protected veya puplic)
    // farkli olabilir
    // child parent'i sınırlandıramaz
    //  yani overriding method'un access modifier'i
    //  ayni veya daha genis kapsamli olmalidir
    //   private -- default -- protected -- public

    public void method1(){

    }
    // 2- private ve static methodlar override edilemez
    // ayni isimde method olusturulunca java CTE vermez
    // ancak override isareti cikmaz ve
    // @Override notasyonu kullanilmak istenirse CTE olur
    // Yani Java bunlari farkli class'lardaki farkli
    // method'lar olarak kabul eder


    public static void method2() {

    }
    private void method3(){

    }
    // 3- return type method signature'ina dahil olmadigindan
    //    farkli secilebilir ancak
    //    return type void veya primitive ise ayni olmak zorundadir
    //    Eger return type'lar non-primitive ise
    //    Child class'daki return type, parent class'daki return type'i
    //    ile ayni veya child'i olmalidir

    public void method4(){

    }
    public String method5(){

        return "";

    }
}

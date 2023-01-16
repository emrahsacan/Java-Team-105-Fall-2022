package ders11_stringManipulation;

public class C01_nullPointer {
    public static void main(String[] args) {

        String str1= "";
        // str1'e deger atanmistir

        System.out.println(str1); // hiçlik yazdırır
        System.out.println(str1.concat("Java")); // Java (hiçlik e ekleme yaptık)

        String str2;
        // str2 oluşturuldu fakat  değer atanmadı

        //System.out.println(str2);// str2 ye değer atamadığı için yazddırılamaz, CTE verir
        //System.out.println(str2.concat("Java"));// değer atanmadığı için method la kullanılamaz

        str2="Java candır";
        System.out.println(str2); // Java candır
        System.out.println(str2.concat(".")); // Java candir.

        String str3=null; // str3'e değer atanmamıştır
                        // null pointer ile javaya değer atamadığımızın farkında olduğumuzu soyluyoruz

        System.out.println(str3);//null işaretlendiğini yazdırır
        //System.out.println(str3.concat("Java"));// NullPointerException

        System.out.println(str3 + "Java"); //nullJava

        System.out.println(str3.toUpperCase());// NullPointerException






    }
}

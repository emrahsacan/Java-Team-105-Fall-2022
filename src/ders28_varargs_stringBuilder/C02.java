package ders28_varargs_stringBuilder;

public class C02 {
    public static void main(String[] args) {
        topla(5,6);
        topla(5,3,8);
        topla(2,4,6,8);
        topla(1); //1
        topla(); // 0
        topla(4,5,6,7,5,3,2,1,2,34,45,56,6,6); // 182
    }

    private static void topla(int... sayilar) {
        int toplamSonucu=0;

        for (int each: sayilar
             ) {
            toplamSonucu+=each;

        }
        System.out.println("Girilen sayıların toplami : " + toplamSonucu);

    }


}



package ders15_overloading_whileLoop;

public class C03_WhileLoop {
    //Genellikle, kaç kere döneceği belli olmayan,
    // koşulun bir girdiye göre denetlendiği durumlarda
    // While  döngüsü kullanılırken , tekrar sayısı
    // belirli olan durumlarda ise for
    // döngüsü kullanılması tercih edilir

    public static void main(String[] args) {

        // 2 basamakli sayilari aralarinda bir bosluk olacak sekilde yanyana yazdirin

        for (int i = 10; i <=99 ; i++) {
            System.out.print(i + " ");
        }

        // while loop ile yaparsak
        System.out.println("");
        int a=10;
        while (a<100){
            System.out.print(a+" ");
            a++;
        }
    }
}


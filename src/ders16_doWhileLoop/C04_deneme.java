package ders16_doWhileLoop;

public class C04_deneme {
    public static void main(String[] args) {

        // Soru 3- Kullanicidan bir pozitif sayi isteyin,
        // sayının tam kare olup olmadığını bulunuz,
        // tamkare ise true değilse false yazdırınız.
        // Ornek :  input : 16, output: 4

        int input = 81;
        int baslangic = 1;
        int bayrak=0;


        do {

            if (baslangic * baslangic == input) {

                System.out.println("True");
                bayrak++;
                break;
            }
            baslangic++;

        } while (baslangic * baslangic <= input);

        if (bayrak==0){
            System.out.println("false");
        }
    }
}

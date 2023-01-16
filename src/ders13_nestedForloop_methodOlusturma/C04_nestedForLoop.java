package ders13_nestedForloop_methodOlusturma;

public class C04_nestedForLoop {
    public static void main(String[] args) {
        /*
        Asagidaki sekli yazdiran bir kod hazirlayin
        * * * * * *
        * * * * * *
        * * * * * *
        * * * * * *
         */
        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=6 ; j++) {
                System.out.print("* ");
            }
            System.out.println(""); // ic loop bitince alt satira gec
        }
    }
}

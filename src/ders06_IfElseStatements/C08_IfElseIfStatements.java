package ders06_IfElseStatements;

import java.util.Scanner;

public class C08_IfElseIfStatements {
    public static void main(String[] args) {

        // Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // kenar uzunlukları0 veya negatif ise "gecersiz kenar uzunluğu" yazdırın
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 3 kenar uzunluğunu yazınız");

        int kenar1 = scan.nextInt();
        int kenar2 = scan.nextInt();
        int kenar3 = scan.nextInt();

        if (kenar1<=0 || kenar2<=0 || kenar3<=0){
            System.out.println("Gecersiz kenar uzunluğu. Bu ölçülerde üçgen olmaz!");
        } else if (kenar1==kenar2 && kenar2==kenar3){
            System.out.println("Üçgen eşkenar üçgendir");
        } else {
            System.out.println("Üçgen eşkenar değildir");
        }


    }
}

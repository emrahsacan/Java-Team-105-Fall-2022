package ders02_dataTurleri_scanner;

import java.util.Scanner;

public class C04_scanner {
    public static void main(String[] args) {

        //Kullanıcıdan ismini alip buyuk harflerle yazdırın
        // 1. adim : scan objesi oluşturma
        Scanner scan=new Scanner(System.in);

        //2. adım : kullanıcıya ne istediğimizi yazdırma
        System.out.println("Lutfen kullanıcı adı giriniz : ");

        // 3. adım : kullanıcıdan istediğimiz bilginin türüne uygun bir variable oluşturup
        // scanner method'larından uygun olanını kullanarak alınan değeri variable'a atayalım

        String kullaniciAdi= scan.next();


        System.out.println(kullaniciAdi.toUpperCase());





    }
}

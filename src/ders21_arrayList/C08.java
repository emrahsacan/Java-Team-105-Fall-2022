package ders21_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C08 {
    public static void main(String[] args) {

        System.out.println(listeOlustur());

    }

    public static List<String> listeOlustur(){
        List<String> isimler=new ArrayList<>();

        Scanner scan= new Scanner(System.in);
        String girilenIsim="";

        while (!girilenIsim.equalsIgnoreCase("q")){
            System.out.println("Lutfen listeye eklemek icin isim giriniz"+
                    "\nBitirmek için q'ya basınız");
            girilenIsim=scan.nextLine();

            if (!girilenIsim.equalsIgnoreCase("q")){
                isimler.add(girilenIsim);
            }
        }
        return isimler;



    }
}

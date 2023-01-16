package kasim30_UcakBileti;

import java.util.Scanner;

public class UcusBilgileri {
    Scanner scan= new Scanner(System.in);
    public void ucusKontrol(){
        Scanner scan= new Scanner(System.in);
        System.out.println("Yapmak istediğiniz yolculuk seklini seçiniz. Tek yon için 1, çift yön için 2 ye basınız : ");
        int secim = scan.nextInt();

        switch (secim){
            case 1:{
                tekYon();
                break;
            }
            case 2:{}
            default:{
                System.out.println("Yanlış değer girdiniz.");
                ucusKontrol();
            }
        }
    }
    private void tekYon(){
        System.out.println("Kalkış noktasını giriniz : ");
        String kalkis=scan.nextLine();
        System.out.println("Inis noktasını giriniz : ");
        String inis=scan.nextLine();
        System.out.println("Gidis tarihi giriniz:(yyyy/mm/dd)");
        String tarih= scan.nextLine();
        char kalkisIlkHarf=kalkis.charAt(0);
        char iniIlkHarf=kalkis.charAt(0);

        System.out.println("");

    }
}

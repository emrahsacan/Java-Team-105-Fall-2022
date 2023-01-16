package ders12_forLoops;

public class C02_ForLoops {
    public static void main(String[] args) {
        for (int i = 1; i <=10 ; i++) {
            System.out.print(i + " ");

        }
        System.out.println(""); // üstte print kullandığımızdan alt satıra
        // aşağıdaki kodu yazdırmak içi bu hiçliği yazdırırız

        // İki bbasamaklı sayılardan 7 ile bölünebilenleri yazdırın

        for (int i = 10; i < 100 ; i++) {
           if (i%7==0) System.out.print(i + " ");

        }
        System.out.println("");
        // 13'den başlayıp 100 e kadar 7'şer artırıp yazdıralım

        for (int i = 13; i < 100 ; i+=7) {
                      System.out.print(i + " ");

        }
        System.out.println("");

        //1'den 10 kadar sınırlar dahil sayıların karelerini yaz

        for (int i = 1; i <=10 ; i++) {
            System.out.print( i * i + " ");

        }
    }

}

package ders12_forLoops;

public class C01_ForLoops {
    public static void main(String[] args) {
        String str= "Java\n";
        // bu str'ı 10 kere yazdırın

        System.out.println(str.repeat(10));

        // repeat olmasaydı

        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);
        System.out.println(str);

        // 1'den 100 e kadar sayıları yazdırın
        // 3 basamaklı 23ile bölünebilen sayıları yazdırın
        for (int i = 1; i <= 100; i++) {
            System.out.print(i+ " ");
        }
    }
}

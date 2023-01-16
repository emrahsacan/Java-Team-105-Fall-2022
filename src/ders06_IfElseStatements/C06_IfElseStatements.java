package ders06_IfElseStatements;

public class C06_IfElseStatements {
    public static void main(String[] args) {

         /*
          if else statement'da { } kullanmazsak
          hem if body'si hem de else body'si icin sadece 1 satir kabul eder
          sonraki satirlar if-else ile ilisiklendirilmez
          her durumda calisir
         */

        int not= 49;

        if (not>=50){
            System.out.println("Sınıfı geçtin");
            System.out.println("Yazın kafan rahat");
        }else {
            System.out.println("Bu dersten kaldın");
            System.out.println("yaz okuluna bekleriz :)");

        }
    }
}

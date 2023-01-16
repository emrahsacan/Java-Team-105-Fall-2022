package ders28_varargs_stringBuilder;

public class C06 {
    public static void main(String[] args) {
        StringBuilder sb= new StringBuilder("Java Güzeldir");


        System.out.println(sb.indexOf("a"));//1 ilk bulduğu a nın indexi


        System.out.println(sb.indexOf("a",2)); //3 --- ikinci indexten sonra a aratıldı

    }
}

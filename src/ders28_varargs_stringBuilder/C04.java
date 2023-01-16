package ders28_varargs_stringBuilder;

public class C04 {
    public static void main(String[] args) {

        StringBuilder sb=new StringBuilder(7);

        System.out.println(sb.capacity()); //7

        System.out.println(sb.length()); // 0

        sb.append("Java");

        System.out.println(sb);
        System.out.println(sb.capacity()); //7

        System.out.println(sb.length());// 4

        sb.append(" guzeldir.");

        System.out.println(sb); // Java guzeldir.
        System.out.println(sb.capacity()); //16
        System.out.println(sb.length()); // 14

        sb.append(" ona ne suphe");
        System.out.println(sb); // Java guzeldir. ona ne suphe
        System.out.println(sb.capacity()); //34
        System.out.println(sb.length()); // 27

        // kapasite ve lenght i eşitlemek istersek

        sb.trimToSize();
        System.out.println(sb.capacity());//27
        System.out.println(sb.length()); //27



    }
}

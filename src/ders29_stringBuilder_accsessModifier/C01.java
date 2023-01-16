package ders29_stringBuilder_accsessModifier;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C01 {
    public static void main(String[] args) {
        LocalDateTime zaman=LocalDateTime.now();
        System.out.println(zaman);//2022-11-26T08:44:13.100347200

        DateTimeFormatter dtf1=DateTimeFormatter.ofPattern("dd/MM/YYYY");

        System.out.println(zaman.format(dtf1));//26/11/2022

        DateTimeFormatter  dtf2= DateTimeFormatter.ofPattern("d:MMM:YY");

        System.out.println(zaman.format(dtf2));//26:Kas:22

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("d.MMMM.YYYY EEEE");
        System.out.println(zaman.format(dtf3));//26.Kasım.2022 Cumartesi

        DateTimeFormatter dtf4=DateTimeFormatter.ofPattern("hh:mm a");
        System.out.println(zaman.format(dtf4)); //08:47 ÖÖ




    }
}

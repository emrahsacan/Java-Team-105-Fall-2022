package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;

public class C04 {
    public static void main(String[] args) {

        LocalDate tarih= LocalDate.now();

        System.out.println(tarih);

        System.out.println(tarih.minusDays(100));

        System.out.println(tarih.minusWeeks(5).minusDays(3));

        System.out.println(tarih.plusMonths(5)
                .plusWeeks(2)
                .plusDays(3));

        System.out.println(tarih.getMonthValue()); //

        System.out.println(tarih.getMonth()); // NOVEMBER

        System.out.println(tarih.getDayOfWeek()); // WEDNESDAY

        System.out.println(tarih.getDayOfYear());// yılın kaçıncı günü 327

        System.out.println(tarih.isLeapYear()); // false

        System.out.println(tarih.withYear(1994).isLeapYear());

        System.out.println(tarih.withYear(2020).withMonth(11).withDayOfMonth(13));

        System.out.println(tarih.lengthOfYear()); //365

        System.out.println(tarih.withYear(1987).lengthOfYear());

        System.out.println(tarih.withYear(1990).withMonth(3).withDayOfMonth(15).getDayOfWeek());

        LocalDate date1= LocalDate.of(2011,11,11);
        LocalDate date2= LocalDate.of(2010,10,10);

        System.out.println(date2.isBefore(date1));

        System.out.println(date2.isAfter(date1));

        System.out.println(tarih.equals(date1));


    }
}

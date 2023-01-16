package ders27_immutableClasses_DateAndTime;

import java.time.LocalDate;
import java.time.Period;

public class C07 {
    public static void main(String[] args) {

        // doğumundan bu güne ne kadar zaman gecti

        LocalDate bugun=LocalDate.now();

        LocalDate dogumGunu=LocalDate.of(1987,7,20);

        Period gecenSure=Period.between(dogumGunu,bugun);

        System.out.println(gecenSure); //P35Y4M3D


        System.out.println(gecenSure.getYears()); //35


    }
}

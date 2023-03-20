package o_o_p_Enums;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        whichSeason(Month.FEBRUARY);
        whichSeason(Month.APRIL);
        whichSeason(Month.AUGUST);
        whichSeason(Month.SEPTEMBER);

    }

    public static void whichSeason(Month month) {

        switch (month) {
            case JANUARY, FEBRUARY, DECEMBER:
                System.out.println("winter season");
                break;
            case MARCH, APRIL, MAY:
                System.out.println("spring season");
                break;
            case JUNE, JULY, AUGUST:
                System.out.println("summer season");
                break;
            case SEPTEMBER, OCTOBER, NOVEMBER:
                System.out.println("fall season");
                break;

        }

    }

}
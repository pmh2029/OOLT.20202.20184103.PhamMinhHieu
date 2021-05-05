package utils;

import java.time.LocalDate;

public class MyDate {
    private int dayValue, monthValue, yearValue;
    private String day, month, year;
    
    public MyDate() {
        this.dayValue = LocalDate.now().getDayOfMonth();
        this.monthValue = LocalDate.now().getMonthValue();
        this.yearValue = LocalDate.now().getYear();
    }

    public MyDate(int dayValue, int monthValue, int yearValue) {
        this.dayValue = dayValue;
        this.monthValue = monthValue;
        this.yearValue = yearValue;
    }
    
    public MyDate(String strDate) {
        String sp = strDate;
        String[] arrTest = sp.split("\\s");
        this.month = arrTest[0];
        this.day = arrTest[1];
        this.year = arrTest[2];

        this.yearValue = Integer.parseInt(year);
        switch (month) {
            case "JANUARY":
                this.monthValue = 1;
                break;
            case "FEBRUARY":
                this.monthValue = 2;
                break;
            case "MARCH":
                this.monthValue = 3;
                break;
            case "APRIL":
                this.monthValue = 4;
                break;
            case "MAY":
                this.monthValue = 5;
                break;
            case "JUNE":
                this.monthValue = 6;
                break;
            case "JULY":
                this.monthValue = 7;
                break;
            case "AUGUST":
                this.monthValue = 8;
                break;
            case "SEPTEMBER":
                this.monthValue = 9;
                break;
            case "OCTOBER":
                this.monthValue = 10;
                break;
            case "NOVEMBER":
                this.monthValue = 11;
                break;
            case "DECEMBER":
                this.monthValue = 12;   
                break;         
            default:
                System.out.println("Nháº­p thĂ¡ng khĂ´ng há»£p lá»‡!!!");
                break;
        }
    
      this.dayValue = Integer.parseInt(day.substring(0, 2));
    }

    public int getDayValue() {
        return dayValue;
    }
    public void setDayValue(int dayValue) {
        this.dayValue = dayValue;
    }

    public int getMonthValue() {
        return monthValue;
    }
    public void setMonthValue(int monthValue) {
        this.monthValue = monthValue;
    }

    public int getYearValue() {
        return yearValue;
    }
    public void setYearValue(int yearValue) {
        this.yearValue = yearValue;
    }



    public void print() {
        System.out.print("Today is: ");
        System.out.print(LocalDate.now().getMonth());
        
        switch (LocalDate.now().getDayOfMonth()) {
            case 1:
                System.out.print(" 1st");
                break;
            case 2:
                System.out.print(" 2nd");
                break;
            case 3:
                System.out.print(" 3rd");
                break;
            case 4:
                System.out.print(" 4th");
                break;
            case 5:
                System.out.print(" 5th");
                break;
            case 6:
                System.out.print(" 6th");
                break;
            case 7:
                System.out.print(" 7th");
                break;
            case 8:
                System.out.print(" 8th");
                break;
            case 9:
                System.out.print(" 9th");
                break;
            case 10:
                System.out.print(" 10th");
                break;
            case 11:
                System.out.print(" 11th");
                break;
            case 12:
                System.out.print(" 12th");
                break;
            case 13:
                System.out.print(" 13th");
                break;
            case 14:
                System.out.print(" 14th");
                break;
            case 15:
                System.out.print(" 15th");
                break;
            case 16:
                System.out.print(" 16th");
                break;
            case 17:
                System.out.print(" 17th");
                break;
            case 18:
                System.out.print(" 18th");
                break;
            case 19:
                System.out.print(" 19th");
                break;
            case 20:
                System.out.print(" 20th");
                break;
            case 21:
                System.out.print(" 21th");
                break;
            case 22:
                System.out.print(" 22th");
                break;
            case 23:
                System.out.print(" 23th");
                break;
            case 24:
                System.out.print(" 24th");
                break;
            case 25:
                System.out.print(" 25th");
                break;
            case 26:
                System.out.print(" 26th");
                break;
            case 27:
                System.out.print(" 27th");
                break;
            case 28:
                System.out.print(" 28th");
                break;
            case 29:
                System.out.print(" 29th");
                break;
            case 30:
                System.out.print(" 30th");
                break;
            case 31:
                System.out.print(" 31th");
                break;
            default:
                break;
        }
        
        String s = String.valueOf(LocalDate.now().getYear());
        System.out.print(" " + s);  
    }

}
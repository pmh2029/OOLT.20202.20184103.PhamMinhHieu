package utils;

import java.util.Scanner;

public class Accept {
    Scanner scanner = new Scanner(System.in);
    
    public void inputK() {
        String dateInput = scanner.nextLine();
        MyDate d = new MyDate(dateInput);
        System.out.print("Ngay ban vua nhap la: " + d.getDayValue());
        System.out.print("/" + d.getMonthValue());
        System.out.print("/" + d.getYearValue() + "\n");
    }
     
}
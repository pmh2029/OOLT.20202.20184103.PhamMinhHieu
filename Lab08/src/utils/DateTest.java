package utils;

public class DateTest {
    
    public static void main(String[] args) throws Exception {
        Accept accept = new Accept();
        MyDate myDate = new MyDate();

        myDate.print();
    
        MyDate day1 = new MyDate(1, 12, 2003);
        System.out.print("\nAdmin test: " + day1.getDayValue());
        System.out.print("/" + day1.getMonthValue());
        System.out.print("/" + day1.getYearValue() + "\n");

        accept.inputK();
        
    }
}
    
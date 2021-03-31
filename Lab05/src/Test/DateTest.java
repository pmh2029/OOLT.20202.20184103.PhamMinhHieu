package Test;

import Utils.*;

public class DateTest {
	public static void main(String[] args) {
	
		MyDate test = new MyDate(1, 2, 2000);
		test.print(test);
		test.print();
		test.dateFormats();
	}	
}
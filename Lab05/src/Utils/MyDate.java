package Utils;
import java.time.LocalDate;
import java.util.Scanner;

public class MyDate {
	private int day;
	private int month;
	private int year;
	
	static String[][] monthStr = {
			{"1", "january", "jan", "jan."}, 
			{"2", "february", "feb", "feb."},
			{"3", "march", "mar", "march"},
			{"4", "april", "apr", "apr."},
			{"5", "may", "may", "may"},
			{"6", "june", "jun", "jun."},
			{"7", "july", "jul", "jul."},
			{"8", "august", "aug", "aug."},
			{"9", "september", "sep", "sep."},
			{"10", "october", "oct", "oct."},
			{"11", "november", "nov", "nov."},
			{"12", "december", "dec", "dec."}
	};
	private static int toIntMonth(String month) {
		month = month.toLowerCase();
		for(int i = 0; i < 12; i++) {
			for(int j = 0; j < 4; j++) {
				if(month.equals(monthStr[i][j]))
					return i + 1;
			}
		}
		return -1;
	}
	private static String toStringMonth(int month) {
		for(int i = 0; i <  12; i++) {
			if(month == i + 1) {
				return monthStr[i][2];
			}
		}
		return "ERROR";
	}
	static String[] dayStr = {
			"first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth",
			"ninth", "tenth", "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
			"sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth", "twenty-first",
			"twenty-second", "twenty-third", "twenty-fourth", "twenty-fifth", "twenty-sixth", 
			"twenty-seventh", "twenty-eighth", "twenty-ninth", "thirtieth", "thirty-first"
	};
	private static int toIntDay(String day, int month) {
		day = day.toLowerCase();
		switch(month) {
		case 1: case 3: case 7: case 8: case 10: case 12:
			for(int i = 0; i < 31; i++) {
				if(day.equals(dayStr[i]))
					return i + 1;
			}
			break;
		case 4: case 6: case 9: case 11:
			for(int j = 0; j < 30; j++) {
				if(day.equals(dayStr[j]))
					return j + 1;
			}
			break;
		case 2:
			for(int k = 0; k < 29; k++) {
				if(day.equals(dayStr[k]))
					return k + 1;
			}
			break;
		default:
			return -1;
		}
		return -1;
	}

	static String[] yearStr = {
			"nineteen ninety one", "nineteen ninety two", "nineteen ninety three", "nineteen ninety four", 
			"nineteen ninety five", "nineteen ninety six", "nineteen ninety seven", "nineteen ninety eight", "nineteen ninety nine",
			"two thousand", "two thousand and one", "two thousand and two", "two thousand and three", "two thousand and four",
			"two thousand and five", "two thousand and six", "two thousand and seven", "two thousand and eight", "two thousand and nine",
			"two thousand and ten", "twenty eleven", "twenty twelse", "twenty thirteen", "twenty fourteen", "twenty fifteen",
			"twenty sixteen", "twenty seventeen", "twenty eighteen", "twenty nineteen", "twenty twenty", "twenty twenty one", 
	};
	private static int toIntYear(String year) {
		for(int i = 0; i < 22; i++) {
			if(year.equals(yearStr[i]))
				return i + 1991;
		}
		return -1;
	}

	public int getDay() {
		return day;
	}
	public boolean setDay(int day) {
		if(day <= 31 && day > 0){
			this.day = day;
			return true;
		}
		else 
			return false;
	}
	public int getMonth() {
		return month;
	}
	public boolean setMonth(int month) {
		if(month <= 12 && month > 0) {
			this.month  = month;
			return true;
		}
		else  
			return false;
	}
	public int getYear() {
		return year;
	}
	public boolean setYear(int year) {
		if(year >  1989) {
			this.year = year;
			return true;
		}
		else
			return  false;
	}
	
	// Contructor
	public MyDate() {
		LocalDate date = LocalDate.now();
		this.day = date.getDayOfMonth();
		this.month = date.getMonthValue();
		this.year = date.getYear();
	}
	public MyDate(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	public MyDate(String str) {
		String[] dateSplit = str.split("\\s");
		this.month =  toIntMonth(dateSplit[0]);
		this.day = Integer.parseInt(dateSplit[1]);
		this.year = Integer.parseInt(dateSplit[2]);
		
	}
	
	public MyDate(String day, String month, String year) {
		this.month = toIntMonth(month);
		this.day = toIntDay(day, this.month);
		this.year = toIntYear(year);
		if(this.month == -1 && this.day == -1 &&  this.year != -1) {
			System.out.println("ERROR! INVALID DATE!!!");
		}
	}

	public void print() {
		MyDate test = new MyDate();
		String Smonth = "";
		switch(test.getMonth()) {
		case 1: Smonth = "January"; break;
		case 2: Smonth = "February"; break;
		case 3: Smonth = "March"; break;
		case 4: Smonth = "April"; break;
		case 5: Smonth = "May"; break;
		case 6: Smonth = "June"; break;
		case 7: Smonth = "July"; break;
		case 8: Smonth = "August"; break;
		case 9: Smonth = "September"; break;
		case 10: Smonth = "October"; break;
		case 11: Smonth = "November"; break;
		case 12: Smonth = "December"; break;
		}
		
		if(test.getDay() == 1 || test.getDay() == 21 || test.getDay() == 31)
			System.out.println("Today is: " + Smonth + " " + test.day + "st " + test.year);
		else if(test.getDay() == 2 || test.getDay() == 22)
			System.out.println("Today is " + Smonth + " " + test.day + "nd " + test.year);
		else if(test.getDay() == 3 || test.getDay() == 23)
			System.out.println("Today is: " + Smonth + " " + test.day + "rd " + test.year);
		else
			System.out.println("Today is: " + Smonth + " " + test.day + "th " + test.year);
	}
	public void print(MyDate date) {
		System.out.println(date.getDay() + "/" + date.getMonth()+ "/" + date.getYear());
	}
	public void printf(MyDate date) {
		System.out.print(date.getDay() + "/" + date.getMonth()+ "/" + date.getYear());
	}
	public void accept() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a date (Eg: February 18 2019): ");
		String date = input.nextLine();
		MyDate test = new MyDate(date);
		System.out.println(test.getMonth() + " " + test.getDay() + " " + test.getYear());
		
		input.close();
	}
	
	public void dateFormats() {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a date (Eg: February 18 2019): ");
		String test = input.nextLine();
		MyDate date = new MyDate(test);
		
		System.out.println("Some output date Formats:");
		System.out.println("1. yyyy-mm-dd (eg: 1930-02-03)");
		System.out.println("2. d/m/yyyy (eg: 3/2/1930)");
		System.out.println("3. mmm-d-yyyy (eg: 03-Feb-1930)");
		System.out.println("4. mmm d yyyy (eg: Feb 3 1930)");
		System.out.println("5. mm-dd-yyyy (eg: 02-03-1930)");
		System.out.println("-> Your choice: ");
		int choice = input.nextInt();
		System.out.print("result: ");
		switch(choice) {
		case 1:
			System.out.print(date.getYear());
			if(date.getMonth() < 10) {
				System.out.print("-0" + date.getMonth());
			}
			else
				System.out.print("-" + date.getMonth());
			if(date.getDay() < 10) {
				System.out.print("-0" + date.getDay() + "\n");
			}
			else
				System.out.print("-" + date.getDay() + "\n");
			break;
		case 2:
			System.out.println(date.getDay() + "/" + date.getMonth() + "/" + date.getYear());
			break;
		case 3:
			if(date.getDay() < 10) {
				System.out.print(date.getDay());
			}
			else
				System.out.print(date.getDay());
			System.out.print("-" + toStringMonth(date.getMonth()));
			System.out.print("-" + date.getYear() + "\n");
			break;
		case 4:
			System.out.print(toStringMonth(date.getMonth()));
			if(date.getDay() < 10) {
				System.out.print(" " + date.getDay());
			}
			else
				System.out.print(" " + date.getDay());
			System.out.print(" " + date.getYear() + "\n");
			break;
		case 5:
			if(date.getMonth() < 10) {
				System.out.print(date.getMonth());
			}
			else
				System.out.print(date.getMonth());
			if(date.getDay() < 10) {
				System.out.print("-0" + date.getDay());
			}
			else
				System.out.print("-" + date.getDay());
			System.out.print("-" + date.getYear() + "\n");
			break;
		default:
			System.out.println("ERROR!!! Number invalid!!!");
		}
	}
}
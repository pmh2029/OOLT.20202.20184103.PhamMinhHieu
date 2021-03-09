//Write a program to display the number of days of a month



import java.util.Scanner;
public class Lab02_5_5 {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		boolean form = true;
		do{
		String month;
		System.out.print("Enter month(To illustrate, the valid inputs of January are January, Jan, Jan., and 1): ");
		month = sc.next();
		int year;
		System.out.print("Enter year(Number only): ");
		year = sc.nextInt();
		switch(month)
		{
			case "1":
			case "Jan.":
			case "Jan":
			case "January":
				System.out.println("\nJanuary " + year +" has 31 Days.");
				break;
			case "3":
			case "Mar.":
			case "Mar":
			case "March":
				System.out.println("\nMarch " + year +" has 31 Days.");
				break;
			case "5":
			case "May":
				System.out.println("\nMay " + year +" has 31 Days.");
				break;
			case "7":
			case "July":
			case "Jul":
				System.out.println("\nJuly " + year +" has 31 Days.");
				break;
			case "8":
			case "Aug.":
			case "August":
			case "Aug":
				System.out.println("\nAugust " + year +" has 31 Days.");
				break;
			case "10":
			case "Oct.":
			case "Oct":
			case "October":
				System.out.println("\nOctober " + year +" has 31 Days.");
				break;
			case "12":
			case "Dec.":
			case "Dec":
			case "December":
				System.out.println("\nDecember " + year +" has 31 Days.");
				break;
			case "4":
			case "Apr":
			case "Apr.":
			case "April":
				System.out.println("\nApril " + year +" has 30 Days.");
				break;
			case "6":
			case "Jun":
			case "June":
				System.out.println("\nJune " + year +" has 30 Days.");
				break;
			case "9":
			case "Sep":
			case "Sept.":
			case "September":
				System.out.println("\nSeptember " + year +" has 30 Days.");
				break;
			case "11":
			case "Nov":
			case "Nov.":
			case "November":
				System.out.println("\nNovember " + year +" has 30 Days.");
				break;
			case "2":
			case "Feb":
			case "Feb.":
			case "February":
				if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					System.out.println("\nFebruary " + year +" has 29 Days.");
				}
				else 
					System.out.println("\nFebruary " + year +" has 28 Days.");
				break;
			default:
				form = false;
				System.out.println("\nWrong input! Please enter the correct form of input!\n");
				break;
		}}while(form = !form);
	}
	
}

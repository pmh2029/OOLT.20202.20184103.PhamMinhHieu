
public class DateUtilsTest 
{
	public static void main(String[] args)
	{
		DateUtils test = new DateUtils();
		MyDate date1 = new MyDate(2, 3, 2020);
		MyDate date2 = new MyDate(1, 3, 2020);
		MyDate date3 = new MyDate(2, 4, 2020);
		MyDate[] dList = {date1, date2, date3};
		test.compareDate(date1, date2);
		test.printCompareDate(date1, date2);
		test.sortDate(dList);
	}	
}
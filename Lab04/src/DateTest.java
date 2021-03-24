import java.time.LocalDate;

public class DateTest {
	public static void main(String[] args) {
		
		MyDate test = new MyDate("Second", "January", "two thousand");
		test.print(test);
		test.print();
		test.dateFormats();
	}
}
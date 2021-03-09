//Write a program to display a triangle with a height of n stars (*), n is entered by users.



import java.util.Scanner;
public class Lab02_5_4 {
  public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int k = 0;
    System.out.print("Enter n: ");
    int n = sc.nextInt();
    System.out.print("\n");
    for (int i = 1; i <= n; ++i, k = 0) {
      for (int space = 1; space <= n - i; ++space) {
        System.out.print("  ");
      }
      while (k != 2 * i - 1) {
        System.out.print("* ");
        ++k;
      }
      System.out.println();
    }
  }
}
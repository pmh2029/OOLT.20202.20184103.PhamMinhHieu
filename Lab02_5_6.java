//Write a Java program to sort a numeric array, and calculate the sum and average value of array elements.



import java.util.Arrays;
import java.util.Scanner;
public class Lab02_5_6 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n, i;
		System.out.print("Enter the number of array: ");
		n = sc.nextInt();
		System.out.print("\n");
		double a[] = new double[n];
		for(i = 0; i < n; i++)
		{
			System.out.print("Enter element [" + i + "]: " );
			a[i] = sc.nextDouble();
		}		
		System.out.print("\nOriginal numeric array: " + Arrays.toString(a)); //toString() hiển thị tất cả các phần tử của mảng trong dấu "[]"
		Arrays.sort(a); //Sap xep cac phan tu cua mang theo thu tu tang dan
		System.out.print("\nSort numeric array: " + Arrays.toString(a));
		double sum = 0;
		for(i = 0; i < a.length; i++)
		{
			sum = sum + a[i];
		}
		System.out.print("\nSum of array: " + sum);
		double avg = sum/a.length;
		System.out.print("\nAverage of array: " + avg);
	}
}

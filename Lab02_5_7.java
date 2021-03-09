//Write a Java program to add two matrices of same size.



import java.util.Scanner;
public class Lab02_5_7 
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int r, c, i, j;
		do
		{
			System.out.print("Enter the number of rows of matrix: ");
			r = sc.nextInt();
			System.out.print("\n");
			System.out.print("Enter the number of columns of matrix: ");
			c = sc.nextInt();
			System.out.print("\n");
		}while(r < 1 || c < 1);
		int m1[][] = new int[r][c];
		int m2[][] = new int[r][c];
		int s[][] = new int[r][c];
		
		System.out.println("Enter elements of 1st matrix: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print("Enter element [" + i + "," + j + "]: ");
				m1[i][j] = sc.nextInt();
			}
		}
		System.out.print("\n");
		System.out.println("Enter elements of 2nd matrix: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print("Enter element [" + i + "," + j + "]: ");
				m2[i][j] = sc.nextInt();
			}
		}
		System.out.print("\n");
		System.out.println("Show 1st matrix: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print(m1[i][j]+ " ");
			}
			System.out.print("\n");
		}
		System.out.print("\n");
		System.out.println("Show 2nd matrix: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print(m2[i][j]+ " ");
			}
			System.out.print("\n");
		}
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				s[i][j] = m1[i][j] + m2[i][j];
			}
		}
		
		System.out.print("\n");
		System.out.println("Show the sum of 2 matrices: ");
		for(i = 0; i < r; i++)
		{
			for(j = 0; j < c; j++)
			{
				System.out.print(s[i][j]+ " ");
			}
			System.out.print("\n");
		}
	}
}

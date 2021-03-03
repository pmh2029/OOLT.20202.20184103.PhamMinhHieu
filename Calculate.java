import javax.swing.JOptionPane;
public class Calculate 
{
	public static void main(String args[])
	{
		String strNum1, strNum2;
		double sum, product, diff, quo;
		strNum1 = JOptionPane.showInputDialog("Enter the first number: ");
		strNum2 = JOptionPane.showInputDialog("Enter the second number: ");
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		sum = num1 + num2;
		product = num1 * num2;
		diff = num1 - num2;
		quo = num1/num2;
		JOptionPane.showMessageDialog(null, "The sum is: " + sum + "\nThe product is: " + product
				+ "\nThe Difference is: " + diff + "\nThe Quotient is: " + quo,"Calculate Result", JOptionPane.INFORMATION_MESSAGE);
	}
}

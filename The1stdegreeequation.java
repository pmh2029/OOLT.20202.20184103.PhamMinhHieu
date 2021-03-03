import javax.swing.JOptionPane;
public class The1stdegreeequation 
{
	public static void main(String args[])
	{
		String strNum1, strNum2;
		double quo;
		strNum1 = JOptionPane.showInputDialog("Enter a: ");
		strNum2 = JOptionPane.showInputDialog("Enter b: ");
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		quo = - num2/num1;
		if(num1 == 0)
		{
			JOptionPane.showMessageDialog(null, "No solution!");
		}
		else
			JOptionPane.showMessageDialog(null, "The solution of the equation " + strNum1 +"x + " + strNum2 + " = 0 is : " + quo,"Calculate Result", JOptionPane.INFORMATION_MESSAGE);
	}
}


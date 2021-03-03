
import javax.swing.JOptionPane;
public class fdewith2variables 
{
	public static void main(String args[])
	{
		String strNum1, strNum2, strNum3, strNum4, strNum5, strNum6;
		double d, d1, d2, n, n1, n2;
		strNum1 = JOptionPane.showInputDialog("Enter a11: ");
		strNum2 = JOptionPane.showInputDialog("Enter a12: ");
		strNum3 = JOptionPane.showInputDialog("Enter b1: ");
		strNum4 = JOptionPane.showInputDialog("Enter a21: ");
		strNum5 = JOptionPane.showInputDialog("Enter a22: ");
		strNum6 = JOptionPane.showInputDialog("Enter b2: ");
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double num3 = Double.parseDouble(strNum3);
		double num4 = Double.parseDouble(strNum4);
		double num5 = Double.parseDouble(strNum5);
		double num6 = Double.parseDouble(strNum6);
		d1 = num1/num4;
		d2 = num2/num5;
		d = num3/num6;
		n = num1*num5 - num4*num2;
		n1 = num3*num5 - num6*num2;
		n2 = num1*num6 - num4*num3;
		if(d1 != d2)
		{
			JOptionPane.showMessageDialog(null, "The system has a unique solution (x1,x2) = (" + n1/n + "," + n2/n + ")","Calculate Result", JOptionPane.INFORMATION_MESSAGE);
		}
		if(d1 == d2 && d1 != d)
		{
			JOptionPane.showMessageDialog(null, "No solution!", "Calculate Result", JOptionPane.INFORMATION_MESSAGE);
		}
		if(d1 == d2 && d1 == d)
		{
			JOptionPane.showMessageDialog(null, "Infinite solution!", "Calculate Result", JOptionPane.INFORMATION_MESSAGE);
		}
	}
}


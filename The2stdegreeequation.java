
import javax.swing.JOptionPane;
public class The2stdegreeequation 
{
	public static void main(String args[])
	{
		String strNum1, strNum2, strNum3;
		double d, d1;
		strNum1 = JOptionPane.showInputDialog("Enter a: ");
		strNum2 = JOptionPane.showInputDialog("Enter b: ");
		strNum3 = JOptionPane.showInputDialog("Enter c: ");
		double num1 = Double.parseDouble(strNum1);
		double num2 = Double.parseDouble(strNum2);
		double num3 = Double.parseDouble(strNum3);
		d = num2*num2 - 4*num1*num3;
		d1 = Math.sqrt(d);
		if(d < 0)
		{
			JOptionPane.showMessageDialog(null, "No solution!", "Calculate Result", JOptionPane.INFORMATION_MESSAGE);
		}
		if(d == 0)
		{
			JOptionPane.showMessageDialog(null, "The equation has double root: x = " + (-num2)/(2*num1), "Calculate Result", JOptionPane.INFORMATION_MESSAGE);

		}
		if(d > 0)
		{
			JOptionPane.showMessageDialog(null, "The equation has two distinct roots: x1 = " + (-num2 + d1)/(2*num1) + " and x2 = " + (-num2 - d1)/(2*num1), "Calculate Result", JOptionPane.INFORMATION_MESSAGE);

		}
	}
}


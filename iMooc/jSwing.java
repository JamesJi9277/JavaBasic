import javax.swing.JOptionPane;

public class simple {
	public static void main(String[] args) {
		int num1;
		int num2;
				
		num1 = Integer.parseInt(JOptionPane.showInputDialog( "Enter first number"));
		num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second number"));
		
		String result = "";
		if(num1 == num2) {
			result = result + num1 + " == " + num2;
		}
		if(num1 < num2) {
			result = result + "\n" + num1 + " < " + num2;
		}
		if(num1 > num2) {
			result = result + "\n" + num1 + " > " + num2;
		}
		JOptionPane.showMessageDialog(null, result, "Comparsion result", JOptionPane.INFORMATION_MESSAGE);
		System.exit(0);
	}
}
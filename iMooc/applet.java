import javax.swing.JApplet;
import javax.swing.JTextArea;

import java.awt.Container;
public class squareIntegers extends JApplet{
	public void init() {
		JTextArea outputArea = new JTextArea();
		Container container = getContentPane();
		container.add(outputArea);
		int result;
		String output = "";
		for(int counter = 1; counter <= 10; counter++) {
			result = square(counter);
			output += "The square of " + counter + " is " + result + "\n";
		}
		outputArea.setText(output);
	}

	private int square(int counter) {
		// TODO Auto-generated method stub
		return counter * counter;
	}
}

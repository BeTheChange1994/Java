import javax.swing.JOptionPane;

public class OddOrEven {

	public static void main(String[] args) {
		
		boolean result;
		int num = Integer.parseInt(JOptionPane.showInputDialog("Please enter a number: "));
		result = is_even(num);
		JOptionPane.showMessageDialog(null, result ? "This is even" : "This is odd");
		
	}
	
	public static boolean is_even(int x) {
		return((x%2)==0);
	}

}

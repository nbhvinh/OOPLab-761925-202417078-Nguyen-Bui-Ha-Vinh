
import javax.swing.JOptionPane;

public class ChoosingOption {
	public static void main(String[] args) {
		int Option = JOptionPane.showConfirmDialog(null,"Do u want to change the 1st class ticket");
		
		JOptionPane.showMessageDialog(null, "You've chosen: " + (Option == JOptionPane.YES_OPTION?"Yes":"No"));
		System.exit(0);
	}
}

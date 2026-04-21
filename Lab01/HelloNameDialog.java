

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
        String res;
        res = JOptionPane.showInputDialog("Pls enter ur name");
        JOptionPane.showMessageDialog(null, "Hi " + res + "!");
        System.exit(0);
    }
    
}

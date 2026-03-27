package Lab01;

import javax.swing.JOptionPane;

public class ShowTwoNumbers {
    public static void main(String[] args) {
        String num1, num2;
        String Noti = "You've just entered: ";
        
        num1 = JOptionPane.showInputDialog(null, "Please input the 1st number: ", "Input the 1st number",JOptionPane.INFORMATION_MESSAGE);
        Noti += num1 + " and ";
        
        num2 = JOptionPane.showInputDialog(null, "Please input the 2nd number: ", "Input the 2nd number", JOptionPane.INFORMATION_MESSAGE);
        Noti += num2;

        JOptionPane.showConfirmDialog(null, Noti, "Show 2 numbers", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}

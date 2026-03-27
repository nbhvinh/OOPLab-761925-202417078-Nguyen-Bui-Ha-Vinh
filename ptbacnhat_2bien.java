

import javax.swing.JOptionPane;

public class ptbacnhat_2bien {
    public static void main(String[] args) {
        double a11 = Double.parseDouble(JOptionPane.showInputDialog("Enter a11:"));
        double a12 = Double.parseDouble(JOptionPane.showInputDialog("Enter a12:"));
        double b1  = Double.parseDouble(JOptionPane.showInputDialog("Enter b1:"));

        double a21 = Double.parseDouble(JOptionPane.showInputDialog("Enter a21:"));
        double a22 = Double.parseDouble(JOptionPane.showInputDialog("Enter a22:"));
        double b2  = Double.parseDouble(JOptionPane.showInputDialog("Enter b2:"));

        double D  = a11 * a22 - a21 * a12;  
        double D1 = b1  * a22 - b2  * a12;  
        double D2 = a11 * b2  - a21 * b1;   
        String result;

        if (D != 0) {
            double x1 = D1 / D;
            double x2 = D2 / D;
            result = "x1 = " + x1 + "\nx2 = " + x2;

        } else {
            if (D1 == 0 && D2 == 0) {
                result = "Vo so nghiem";
            } else {
                result = "Vo nghiem";
            }
        }
        JOptionPane.showMessageDialog(null,
            "pt 1: " + a11 + "x1 + " + a12 + "x2 = " + b1 + "\n" +
            "pt 2: " + a21 + "x1 + " + a22 + "x2 = " + b2 + "\n\n" +
            "Ket qua:\n" + result,
            "Ket qua", JOptionPane.INFORMATION_MESSAGE);
    }

}

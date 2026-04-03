

import javax.swing.JOptionPane;

public class congtrunhanchia {
    public static void main(String[] args){
        String num1, num2;
        String Noti;
        
        num1 = JOptionPane.showInputDialog(null, "Please input the 1st number: ", "Input the 1st number",JOptionPane.INFORMATION_MESSAGE);

        num2 = JOptionPane.showInputDialog(null, "Please input the 2nd number: ", "Input the 2nd number", JOptionPane.INFORMATION_MESSAGE);

        double dnum1 = Double.parseDouble(num1);
        double dnum2 = Double.parseDouble(num2);    
        double sum = dnum1 + dnum2; 
        double diff = dnum1 - dnum2;
        double prod = dnum1 * dnum2;
        double quot = dnum1 / dnum2;

        String s = Double.toString(sum);
        String d = Double.toString(diff);
        String p = Double.toString(prod);
        String q = Double.toString(quot);
        
        Noti = "Tong: " + s + "\n Hieu: " + d + "\n Tich: " + p + "\n Thuong: " + q;

        JOptionPane.showMessageDialog(null, Noti, "Result: ", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
    
}


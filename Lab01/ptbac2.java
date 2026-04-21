import javax.swing.JOptionPane;

public class ptbac2 {
    public static void main(String[] args) {
        double a = Double.parseDouble(JOptionPane.showInputDialog("Nhap a:"));
        double b = Double.parseDouble(JOptionPane.showInputDialog("Nhap b:"));
        double c = Double.parseDouble(JOptionPane.showInputDialog("Nhap c:"));

        String result;

        if (a == 0) {
            if (b == 0) {
                if (c == 0) {
                    result = "Vo so nghiem";
                } else {
                    result = "Vo nghiem";
                }
            } else {
                double x = -c / b;
                result = "Co 1 nghiem: x = " + x;
            }

        } else {
            double delta = b * b - 4 * a * c;

            if (delta > 0) {
                double x1 = (-b + Math.sqrt(delta)) / (2 * a);
                double x2 = (-b - Math.sqrt(delta)) / (2 * a);
                result = "2 nghiem:\nx1 = " + x1 + "\nx2 = " + x2;

            } else if (delta == 0) {
                double x = -b / (2 * a);
                result = "Nghiem kep:\nx1 = x2 = " + x;

            } else {
                // No real roots
                result = "Vo nghiem\nDelta = " + delta;
            }
        }

        // Output
        JOptionPane.showMessageDialog(null,
            "He pt: " + a + "x² + " + b + "x + " + c + " = 0\n\n" +
            "Nghiem:\n" + result,
            "Ket qua", JOptionPane.INFORMATION_MESSAGE);
    }
}

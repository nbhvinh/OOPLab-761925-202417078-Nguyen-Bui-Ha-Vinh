package hust.soict.hedspi.swing;

import java.awt.*;       // Vẫn cần dùng Container và Layout
import java.awt.event.*; // Vẫn cần dùng Listener
import javax.swing.*;    // Import thêm thư viện Swing

// Lớp SwingAccumulator kế thừa từ JFrame thay vì Frame [cite: 129, 194]
public class SwingAccumulator extends JFrame {
    private JTextField tfInput;
    private JTextField tfOutput;
    private int sum = 0;

    public SwingAccumulator() {
        // Lấy Content Pane của JFrame [cite: 135, 200]
        Container cp = getContentPane();
        // Thiết lập layout cho Content Pane [cite: 136, 201]
        cp.setLayout(new GridLayout(2, 2));

        cp.add(new JLabel("Enter an Integer: ")); // Dùng JLabel [cite: 139, 202]

        tfInput = new JTextField(10); // Dùng JTextField [cite: 142, 203]
        cp.add(tfInput);
        tfInput.addActionListener(new TFInputListener());

        cp.add(new JLabel("The Accumulated Sum is: "));
        
        tfOutput = new JTextField(10);
        tfOutput.setEditable(false);
        cp.add(tfOutput);

        setTitle("Swing Accumulator"); // [cite: 159, 208]
        setSize(350, 120);             // [cite: 161, 208]
        setVisible(true);              // [cite: 163, 208]
    }

    public static void main(String[] args) {
        new SwingAccumulator(); // [cite: 179, 180, 210]
    }

    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            int numberIn = Integer.parseInt(tfInput.getText()); // [cite: 183]
            sum += numberIn; // [cite: 184]
            tfInput.setText(""); // [cite: 185]
            tfOutput.setText(sum + ""); // [cite: 186]
        }
    }
}
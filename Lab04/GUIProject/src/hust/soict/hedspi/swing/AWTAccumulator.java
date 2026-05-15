package hust.soict.hedspi.swing;

import java.awt.*;
import java.awt.event.*;

public class AWTAccumulator extends Frame {
    private TextField tfInput;   // Trường nhập liệu [cite: 47]
    private TextField tfOutput;  // Trường hiển thị kết quả [cite: 48]
    private int sum = 0;         // Biến tích lũy tổng, khởi tạo là 0 [cite: 48, 49]

    // Constructor để thiết lập GUI và trình xử lý sự kiện [cite: 50]
    public AWTAccumulator() {
        // Thiết lập GridLayout với 2 hàng và 2 cột [cite: 51]
        setLayout(new GridLayout(2, 2));

        // Thêm nhãn và TextField cho việc nhập số [cite: 52, 53, 54]
        add(new Label("Enter an Integer: "));
        tfInput = new TextField(10);
        add(tfInput);

        // Đăng ký listener cho TextField nhập liệu [cite: 55]
        tfInput.addActionListener(new TFInputListener());

        // Thêm nhãn và TextField cho việc hiển thị tổng [cite: 56, 59, 63]
        add(new Label("The Accumulated Sum is: "));
        tfOutput = new TextField(10);
        tfOutput.setEditable(false); // Đặt thành chỉ đọc [cite: 61]
        add(tfOutput);

        setTitle("AWT Accumulator"); // Thiết lập tiêu đề [cite: 66]
        setSize(350, 120);            // Thiết lập kích thước [cite: 68]
        setVisible(true);             // Hiển thị Frame [cite: 70]
    }

    public static void main(String[] args) {
        // Gọi constructor để khởi tạo ứng dụng [cite: 75, 77]
        new AWTAccumulator();
    }

    // Lớp nội bộ để xử lý sự kiện khi nhấn Enter [cite: 85]
    private class TFInputListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent evt) {
            // Lấy số từ TextField, cộng vào tổng và cập nhật giao diện [cite: 86, 87, 89]
            int numberIn = Integer.parseInt(tfInput.getText());
            sum += numberIn;
            tfInput.setText("");            // Xóa trường nhập [cite: 91]
            tfOutput.setText(sum + "");     // Hiển thị tổng mới [cite: 93]
        }
    }
}
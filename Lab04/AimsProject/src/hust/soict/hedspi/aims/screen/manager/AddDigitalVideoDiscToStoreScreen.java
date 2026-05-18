package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.DigitalVideoDisc;

public class AddDigitalVideoDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle, tfCategory, tfDirector, tfLength, tfCost;

    public AddDigitalVideoDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add Digital Video Disc to Store");
        setVisible(true);
    }

    @Override
    protected JPanel createCenter() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("Title: "));
        tfTitle = new JTextField();
        panel.add(tfTitle);

        panel.add(new JLabel("Category: "));
        tfCategory = new JTextField();
        panel.add(tfCategory);

        panel.add(new JLabel("Director: "));
        tfDirector = new JTextField();
        panel.add(tfDirector);

        panel.add(new JLabel("Length: "));
        tfLength = new JTextField();
        panel.add(tfLength);

        panel.add(new JLabel("Cost ($): "));
        tfCost = new JTextField();
        panel.add(tfCost);

        JButton btnAdd = new JButton("Add Item");
        btnAdd.addActionListener(e -> {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            String director = tfDirector.getText();
            int length = Integer.parseInt(tfLength.getText());
            float cost = Float.parseFloat(tfCost.getText());

            DigitalVideoDisc dvd = new DigitalVideoDisc(title, category, director, length, cost);
            store.addMedia(dvd);

            JOptionPane.showMessageDialog(this, "Digital Video Disc added successfully!");
            new StoreManagerScreen(store);
            this.dispose();
        });
        panel.add(btnAdd);

        return panel;
    }
}
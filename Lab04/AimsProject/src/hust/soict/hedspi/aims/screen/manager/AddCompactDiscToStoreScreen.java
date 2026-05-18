package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.CompactDisc;

public class AddCompactDiscToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfTitle, tfCategory, tfArtist, tfDirector, tfCost;

    public AddCompactDiscToStoreScreen(Store store) {
        super(store);
        setTitle("Add Compact Disc to Store");
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

        panel.add(new JLabel("Artist: "));
        tfArtist = new JTextField();
        panel.add(tfArtist);

        panel.add(new JLabel("Director: "));
        tfDirector = new JTextField();
        panel.add(tfDirector);

        panel.add(new JLabel("Cost ($): "));
        tfCost = new JTextField();
        panel.add(tfCost);

        JButton btnAdd = new JButton("Add Item");
        btnAdd.addActionListener(e -> {
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            String artist = tfArtist.getText();
            String director = tfDirector.getText();
            float cost = Float.parseFloat(tfCost.getText());

            CompactDisc cd = new CompactDisc(title, category, artist, director, cost);
            store.addMedia(cd);

            JOptionPane.showMessageDialog(this, "Compact Disc added successfully!");
            new StoreManagerScreen(store);
            this.dispose();
        });
        panel.add(btnAdd);

        return panel;
    }
}
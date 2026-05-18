package hust.soict.hedspi.aims.screen.manager;

import javax.swing.*;
import java.awt.*;
import hust.soict.hedspi.aims.store.Store;
import hust.soict.hedspi.aims.media.Book;

public class AddBookToStoreScreen extends AddItemToStoreScreen {
    private JTextField tfId, tfTitle, tfCategory, tfCost, tfAuthor;

    public AddBookToStoreScreen(Store store) {
        super(store);
        setTitle("Add Book to Store");
        setVisible(true);
    }

    @Override
    protected JPanel createCenter() {
        JPanel panel = new JPanel(new GridLayout(6, 2, 10, 10));

        panel.add(new JLabel("ID: "));
        tfId = new JTextField();
        panel.add(tfId);

        panel.add(new JLabel("Title: "));
        tfTitle = new JTextField();
        panel.add(tfTitle);

        panel.add(new JLabel("Category: "));
        tfCategory = new JTextField();
        panel.add(tfCategory);

        panel.add(new JLabel("Cost ($): "));
        tfCost = new JTextField();
        panel.add(tfCost);

        panel.add(new JLabel("Author: "));
        tfAuthor = new JTextField();
        panel.add(tfAuthor);

        JButton btnAdd = new JButton("Add Item");
        btnAdd.addActionListener(e -> {
            int id = Integer.parseInt(tfId.getText());
            String title = tfTitle.getText();
            String category = tfCategory.getText();
            float cost = Float.parseFloat(tfCost.getText());

            Book book = new Book(id, title, category, cost);
            
            String author = tfAuthor.getText().trim();
            if (!author.isEmpty()) {
                book.addAuthor(author);
            }

            store.addMedia(book);

            JOptionPane.showMessageDialog(this, "Book added successfully!");
            new StoreManagerScreen(store);
            this.dispose();
        });
        panel.add(btnAdd);

        return panel;
    }
}
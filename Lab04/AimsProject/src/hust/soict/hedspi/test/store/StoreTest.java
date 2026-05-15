package hust.soict.hedspi.test.store;

import hust.soict.hedspi.aims.media.*;
import hust.soict.hedspi.aims.store.Store;

public class StoreTest {
    public static void main(String[] args) {
        Store store = new Store();

        DigitalVideoDisc dvd = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        Book book = new Book();
        book.setTitle("Java Programming");
        book.setCost(25.0f);
        CompactDisc cd = new CompactDisc("Greatest Hits", "Pop", "Michael Jackson", "Various", 50.0f);

        store.addMedia(dvd);
        store.addMedia(book);
        store.addMedia(cd);
        
        store.print();

        store.removeMedia(book);
        store.print();
    }
}
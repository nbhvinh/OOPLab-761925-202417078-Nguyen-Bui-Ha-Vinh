package hust.soict.hedspi.test.media;

import java.util.ArrayList;
import java.util.List;
import hust.soict.hedspi.aims.media.*;

public class MediaTest {
    public static void main(String[] args) {
        List<Media> mediae = new ArrayList<Media>();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 124, 24.95f);
        
        CompactDisc cd1 = new CompactDisc("Greatest Hits", "Pop", "Michael Jackson", "Various", 15.0f);
        cd1.addTrack(new Track("Billie Jean", 5));
        cd1.addTrack(new Track("Beat It", 4));

        CompactDisc cd2 = new CompactDisc("21", "Soul", "Adele", "Jim Abbiss", 20.0f);
        cd2.addTrack(new Track("Rolling in the Deep", 4));
        cd2.addTrack(new Track("Someone Like You", 5));

        Book book1 = new Book("Java Design Patterns", "Technology", 30.0f);
        book1.addAuthor("Erich Gamma");
        book1.addAuthor("Richard Helm");

        Book book2 = new Book("Doraemon", "Comic", 5.5f);
        book2.addAuthor("Fujiko F. Fujio");

        Book book3 = new Book("Clean Code", "Technology", 45.0f);
        book3.addAuthor("Robert C. Martin");

        mediae.add(dvd1);
        mediae.add(dvd2);
        mediae.add(cd1);
        mediae.add(cd2);
        mediae.add(book1);
        mediae.add(book2);
        mediae.add(book3);
        
        System.out.println("\n--- TESTING POLYMORPHISM ---\n");
        for (Media m : mediae) {
            System.out.println(m.toString());
        }
    }
}
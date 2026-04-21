public class Aims {
    public static void main(String[] args) {
        Cart anOrder = new Cart();

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Sci-Fi", "George Lucas", 124, 24.95f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation", 18.99f);

        System.out.println("--- ID Check ---");
        System.out.println("DVD 1 ID: " + dvd1.getId());
        System.out.println("DVD 2 ID: " + dvd2.getId()); 
        System.out.println("Total DVDs created: " + DigitalVideoDisc.getNbDigitalVideoDiscs());
        System.out.println("----------------\n");
        anOrder.addDigitalVideoDisc(dvd1);

        anOrder.addDigitalVideoDisc(dvd2, dvd3);

        DigitalVideoDisc dvd4 = new DigitalVideoDisc("Cinderella");
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Jungle Book");
        anOrder.addDigitalVideoDisc(dvd4, dvd5); 

        anOrder.print();

        System.out.println("\n--- Search Test ---");
        anOrder.search(2); 
        anOrder.search(99); 
        
        anOrder.search("LION");
        anOrder.search("Titanic");
        System.out.println("-------------------\n");

        System.out.println("--- Remove Test ---");
        anOrder.removeDigitalVideoDisc(dvd3);
        System.out.println("After removing Aladin:");
        anOrder.print();
    }
}
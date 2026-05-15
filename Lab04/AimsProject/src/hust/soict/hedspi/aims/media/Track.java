package hust.soict.hedspi.aims.media;

public class Track implements Playable {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() { return title; }
    public int getLength() { return length; }

    @Override
    public void play() {
        if (this.length > 0) {
            System.out.println("Playing track: " + this.title);
            System.out.println("Track length: " + this.length);
        } else {
            System.err.println("ERROR: Track [" + this.title + "] cannot be played (length is 0 or less).");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof Track)) return false;
        Track other = (Track) obj;
        return this.length == other.getLength() && 
               this.title != null && this.title.equals(other.getTitle());
    }
}
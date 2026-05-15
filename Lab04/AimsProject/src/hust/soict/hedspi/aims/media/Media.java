package hust.soict.hedspi.aims.media;

import java.util.Comparator;

public abstract class Media {
    private int id;
    private String title;
    private String category;
    private float cost;

    public static final Comparator<Media> COMPARE_BY_TITLE_COST = new MediaComparatorByTitleCost();
    public static final Comparator<Media> COMPARE_BY_COST_TITLE = new MediaComparatorByCostTitle();

    public Media() {
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getCategory() { return category; }
    public void setCategory(String category) { this.category = category; }
    public float getCost() { return cost; }
    public void setCost(float cost) { this.cost = cost; }
 
    public boolean isMatch(String title) {
        return this.getTitle() != null && this.getTitle().toLowerCase().contains(title.toLowerCase());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; 
        if (obj == null || getClass() != obj.getClass()) return false; 
        
        Media other = (Media) obj;
        return this.title != null && this.title.equals(other.getTitle());    }
}

class MediaComparatorByTitleCost implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int titleDiff = m1.getTitle().compareTo(m2.getTitle());
        if (titleDiff != 0) return titleDiff;
        return Float.compare(m2.getCost(), m1.getCost());
    }
}

class MediaComparatorByCostTitle implements Comparator<Media> {
    @Override
    public int compare(Media m1, Media m2) {
        int costDiff = Float.compare(m2.getCost(), m1.getCost());
        if (costDiff != 0) return costDiff;
        return m1.getTitle().compareTo(m2.getTitle());
    }
}
package sorting.sortSing;

public class Sing implements Comparable<Sing>{
    String title;
    String artist;
    String rating;
    String bmp;

    public Sing(String title , String artist , String rating , String bmp) {
        this.title = title;
        this.artist = artist;
        this.rating = rating;
        this.bmp = bmp;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBmp() {
        return bmp;
    }

    @Override
    public String toString() {
        return title + " " + artist + " " + rating + " " + bmp + " \n ";
    }
    public boolean equals(Object sing) {
        Sing p = (Sing) sing;
        return getTitle ().equals(p.getTitle ());
    }
    public int hashCode() {
        return title.hashCode();
    }

    @Override
    public int compareTo(Sing o) {
            return title.compareTo(o.getTitle ());

    }
}

package disc;

public class Track implements Playable, Comparable<Object> {
    private String title;
    private int length;

    public Track(String title, int length) {
        this.title = title;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }
   
    @Override
    public void play() {
        System.out.println("Playing Track: " + this.getTitle());
        System.out.println("Track length: " + this.getLength());
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Track) {
            Track track = (Track) o;
            if (track.getTitle().equals(this.title)) {
                return track.getLength() == this.length;
            }
        }
        return false;
    }


    
    @Override
    public int compareTo(Object o) {
        if (o instanceof Track) {
            Track book = (Track) o;
            return this.title.compareTo(book.getTitle());                 
        }
        return 0;
    }
}
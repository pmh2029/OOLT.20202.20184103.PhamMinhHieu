package disc;

import media.*;

public class Disc extends Media {
    protected String director;
    protected int length;


    public Disc(int id, String title, String category, String director,int length, float cost) {
        super(id, title, category, cost);
        this.length = length;
        this.director = director;
    }


    public String getDirector() {
        return director;
    }


    public int getLength() {
        return length;
    }

    
}
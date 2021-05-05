package disc;

import java.util.ArrayList;

public class CompactDisc extends Disc implements Playable{

    private String artist;
    private ArrayList<Track> trackList = new ArrayList<>();
    
    public CompactDisc (int id, String title, String category, String director, String artist,int length, float cost, ArrayList<Track> trackList) {
        super(id, title, category, director, length, cost);
        this.artist = artist;
        this.trackList.addAll(trackList);
    }

    public String getArtist() {
        return artist;
    }

    public void addTrack(Track track) {
        if (trackList.contains(track)) {
            System.out.println("Track exist!");
        }
        else {         
            trackList.add(track);
            System.out.println("Add track successfully!");
            System.out.println(track.getTitle() + "###" + track.getLength());
        }
    }

    public void removeTrack(Track track) {
        if (trackList.contains(track)) {
            trackList.remove(track);
            System.out.println("Remove track successfully!");
            System.out.println(track.getTitle() + "###" + track.getLength());
        }
        else {
            System.out.println("Track not exist!");
        }
    }
    
    @Override
    public int getLength() {
        return length;
    }

    public int setLength() {
        for(Track trackTest : trackList) {
            length += trackTest.getLength();
        };
        return length;
    }

    @Override
    public void play() {
        System.out.println("Playing CD: " + this.title + " ### " + this.category + " ### " + this.director + " ### " + getArtist());
        System.out.println("Total CD length: " + this.getLength());
        for(Track trackTest : trackList) {
            trackTest.play();
        }
    }

    public void printTrackList() {
        for(Track trackTest : trackList) {
            System.out.println(trackTest.getTitle() + " ### " + trackTest.getLength());
        }
    }

    public void playTrack() {
        for(Track trackTest : trackList) {
            trackTest.play();
        }
    }

}
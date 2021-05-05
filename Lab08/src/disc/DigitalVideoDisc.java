package disc;
public class DigitalVideoDisc extends Disc implements Playable{

    public DigitalVideoDisc(int id, String title, String category, String director,int length, float cost) {
        super(id, title, category, director, length, cost);
    }

    @Override
    public void play() {
        System.out.println("Playing DVD: " + this.getTitle());
        System.out.println("DVD length: " + this.getLength());
    }
    
    
}
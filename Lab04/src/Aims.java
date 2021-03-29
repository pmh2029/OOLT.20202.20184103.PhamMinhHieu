import java.util.*;
public class Aims {

	public static void main(String[] args) 
    {
		int count = 0;
		Scanner sc = new Scanner(System.in);
		Order anOrder = new Order();
		DigitalVideoDisc unknown = new DigitalVideoDisc();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
		dvd1.setCategory("Animation");
		dvd1.setCost(19.95f);
		dvd1.setDirector("Roger Allers");
		dvd1.setLength(87);
		anOrder.addDigitalVideoDisc(dvd1);
		
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
		dvd2.setCategory("Science Fiction");
		dvd2.setCost(24.95f);
		dvd2.setDirector("George Lucas");
		dvd2.setLength(124);
		anOrder.addDigitalVideoDisc(dvd2);
		
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
		dvd3.setCategory("Animation");
		dvd3.setCost(18.99f);
		dvd3.setDirector("John Musker");
		dvd3.setLength(90);
		anOrder.addDigitalVideoDisc(dvd3);
		DigitalVideoDisc[] all = {dvd1, dvd2, dvd3};
		
		System.out.println("Total cost is: " + anOrder.totalCost());
		//anOrder.removeDigitalVideoDisc(dvd3);
		System.out.println("Total cost is: " + anOrder.totalCost());
		System.out.print("Type the word you want to search: ");
        String input = sc.nextLine();
        
        System.out.println("Search result: ");
        for(DigitalVideoDisc dc: all) {
            if (unknown.search(input, dc)) {                
                System.out.println("DVD info: " + dc.getTitle() + " - " + dc.getCategory() + " - " + dc.getDirector()+ " - " + dc.getLength() + " - " + dc.getCost());
                count++;
            }    
        }
        if (count == 0) {
            System.out.println("Does not exist!");
        }
		
		DigitalVideoDisc dvdList[] = new DigitalVideoDisc[3];
		dvdList[0] = dvd1;
		dvdList[1] = dvd2;
		dvdList[2] = new DigitalVideoDisc();
		anOrder.addDigtalVideoDisc(dvdList);
		anOrder.printOrder(dvdList);
	}
}

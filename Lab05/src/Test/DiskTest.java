package Test;

import Disc.*;
import Order.Order;
import java.util.Scanner;

public class DiskTest 
{
    public static void main(String[] args)
     {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        Order anOrder = new Order();
        DigitalVideoDisc unknown = new DigitalVideoDisc();
        
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Call Me by Your Name", "Romatic Drama", "Luca Guadagnino", 132, 146.45f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Your Name Engraved Herein", "Romatic Drama", "Patrick Kuang-Hui Liu", 114, 65.83f);    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("To All the Boys I've Loved Before", "Teen Romatic Comedy", "Susan Johnson", 99, 491.27f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Greatest Showman", "Musical Drama", "Micheal Gracey", 105, 842.88f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Twilight", "Romantic Fantasy", "Caltherine Hardwicke", 121, 850.89f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("A Star Is Born", "Musical Romantic Drama", "Bradley Cooper", 136, 681.56f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Silent Hill", "Psychological Horror", "Christopne Gans", 125, 522.01f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Us and Them", "Romantic Drama", "Rene Liu", 129, 447.34f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Frozen", "Computer Animated Musical Fantasy", "Chris Buck", 102, 273.32f);
        
        DigitalVideoDisc[] dvdList = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9};
        
        System.out.print("Type the word you want to search: ");
        String input = sc.nextLine();
        
        System.out.println("Search result: ");
        for(DigitalVideoDisc disc: dvdList) {
            if (unknown.search(input, disc)) {                
                System.out.println("DVD info: " + disc.getTitle() + " - " + disc.getCategory() + " - " + disc.getDirector()+ " - " + disc.getLength() + " - " + disc.getCost() + "$");
                count++;
            }    
        }
        if (count == 0) {
            System.out.println("DVD does not exist!");
        }
        anOrder.addDigtalVideoDisc(dvdList);
        anOrder.printOrder(dvdList);
        anOrder.getLuckyItem(dvdList);
        anOrder.printOrder(dvdList);
    }
}

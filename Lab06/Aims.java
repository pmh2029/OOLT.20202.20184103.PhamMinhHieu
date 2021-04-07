import java.util.Scanner;
import java.util.ArrayList;

import media.*;
import order.*;
import utils.*;

public class Aims {
    

    //************************** Menu ***************************
    public static void showMenu() {
        System.out.println("\nOrder Management Application: ");
        System.out.println("--------------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("--------------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
      
    public static void main(String[] args) {
        //************************** Data ***************************
        Order anOrder = new Order(); 
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2= new Scanner(System.in);
        int op = 1;

        DigitalVideoDisc dvd1 = new DigitalVideoDisc("Call Me by Your Name", "Romatic Drama", 146.45f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Your Name Engraved Herein", "Romatic Drama", 65.83f);    
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("To All the Boys I've Loved Before", "Teen Romatic Comedy", 491.27f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc("The Greatest Showman", "Musical Drama", 842.88f);
        DigitalVideoDisc dvd5 = new DigitalVideoDisc("Twilight", "Romantic Fantasy", 850.89f);
        DigitalVideoDisc dvd6 = new DigitalVideoDisc("A Star Is Born", "Musical Romantic Drama", 681.56f);
        DigitalVideoDisc dvd7 = new DigitalVideoDisc("Silent Hill", "Psychological Horror", 522.01f);
        DigitalVideoDisc dvd8 = new DigitalVideoDisc("Us and Them", "Romantic Drama", 447.34f);
        DigitalVideoDisc dvd9 = new DigitalVideoDisc("Frozen", "Computer Animated Musical Fantasy", 273.32f);
        

        Media arrMediaList[] = {dvd1, dvd2, dvd3, dvd4, dvd5, dvd6, dvd7, dvd8, dvd9};
        //***********************************************************
        
        while (op != 0) {
            showMenu();            
            op = scanner1.nextInt();
            switch (op) {
                case 1:                                   
                    anOrder.addOrdered();
                    if (anOrder.getNbOrdered() != 0 && anOrder.getNbOrdered() <=3) {
                        if (anOrder.getNbOrdered()>1) {
                            anOrder.removeOrdered();
                            anOrder.printList();
                            anOrder.addOrdered();
                            anOrder.clearMediaList();
                            System.out.println("Your new order are ready!");
                            System.out.println("Your number of Ordered is " + anOrder.getNbOrdered());
                        }
                        else {
                            System.out.println("Your ordered are ready!");                            
                        }
                    }
                    else {
                        System.out.println("Limited number of Ordered!!!");
                    }
                    break;           
                case 2:
                    int count = 0;
                    if (anOrder.getNbOrdered() == 0) {
                        System.out.println("You have no Ordered! Choose 1 on Menu to creat an Ordered!");
                    }
                    else {
                        System.out.println("Input name of media:");
                        String nameMedia = scanner2.nextLine();
                        System.out.println("\n");
                        for(Media mediaCheck : arrMediaList) {
                            if (nameMedia.equals(mediaCheck.getTitle())) {
                                anOrder.addMedia(mediaCheck);
                                count++;
                            }
                        }
                        if (count == 0) {
                            System.out.println("Not exist Media!!!");
                        }
                    }
                    break;
                case 3:
                    int choose;
                    if (anOrder.getNbOrdered() == 0) {
                        System.out.println("You have no Ordered! Choose 1 on Menu to create an Ordered!");
                    }
                    else {
                        if (anOrder.countItemOrdered() == 0) {
                            System.out.println("You had no item ordered!!! Choose 2 on Menu to add an Ordered!");
                        }
                        else {
                            anOrder.printList();
                            System.out.println("Choose items want to remove!!!");
                            choose = scanner2.nextInt();
                            anOrder.removeMediaBuyNumber(choose);
                            System.out.println("Remove successfully!");
                        }
                    }
                    break;
                case 4:
                    if (anOrder.getNbOrdered() == 0) {
                        System.out.println("You have no Ordered! Choose 1 on Menu to create an Ordered!");
                    }
                    else {
                    anOrder.printList();
                    }
                    break;
                default:
                    break;
            }
        }
    }
}

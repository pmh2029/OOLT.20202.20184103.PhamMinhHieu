package order;

import java.util.Scanner;
import java.util.ArrayList;

import utils.*;
import media.*;


public class Order {
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private int nbOrdered = 0; 

    public static final int MAX_LIMITTED_ORDERED = 3;

    //***************************** Add and Remove methods *****************************

    public int addOrdered() {
        if (nbOrdered < MAX_LIMITTED_ORDERED) {
            nbOrdered++;
        }
        return nbOrdered;
    }

    public int removeOrdered() {
        if (nbOrdered >= 0) {
            nbOrdered--;
        }
        return nbOrdered;
    }

    public void addMedia(Media media) {
        itemsOrdered.add(media);
        System.out.println("Your item is successfully added: ");
        System.out.println(media.getTitle() + " ****** " + media.getCost() + "$.");
        System.out.println("Total Cost: " + totalCost() + "$.");
    }

    public void removeMedia(Media media) {
        itemsOrdered.remove(media);
        System.out.println("Your item is successfully removed: ");
        System.out.println(media.getTitle() + " ***** " + media.getCost() + "$.");
        System.out.println("Total Cost: " + totalCost() + "$.");
    }

    public void removeMediaBuyNumber (int number) {
        number--;
        itemsOrdered.remove(number);
        System.out.println("Total Cost: " + totalCost() + "$.");
    }

    public void clearMediaList() {
        itemsOrdered.clear();
    }

    //***************************** Total cost method *****************************

    public float totalCost() {
        float totalCost = 0.0f;
        for (Media mediaCheck: itemsOrdered) {
            totalCost += mediaCheck.getCost();
        }
        return totalCost;
    }
    
    //***************************** Getter and Setter methods *****************************
    
    public int countItemOrdered() {
        return itemsOrdered.size();
    }

    public int getNbOrdered() {
        return nbOrdered;
    }

    public void setNbOrdered(int nbOrdered) {
        this.nbOrdered = nbOrdered;
    }
    //********************************* Print list method **********************************
    public void printList() {
        int count = 0;
        System.out.println("\n********** Number " + nbOrdered + "**********");
        for(Media mediaCheck : itemsOrdered) {
            count++;
            System.out.print(count + ": ");
            System.out.println(mediaCheck.getTitle() + " ***** " + mediaCheck.getCategory() + " ***** " + mediaCheck.getCost() + "$.");
        }
        System.out.println("Total Cost: " + totalCost() + "$.");
    }
}
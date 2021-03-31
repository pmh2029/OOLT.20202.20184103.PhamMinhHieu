package Order;

import Utils.*;
import Disc.*;
import java.util.*;

public class Order {
	private int qtyOrdered;
	public static final int MAX_NUMBER_ORDERED = 10;
	public static final int MAX_LIMITTED_ORDERED = 5;
	private static int nbOrders = 0;
	private DigitalVideoDisc itemsOrdered[] = new
			DigitalVideoDisc[MAX_NUMBER_ORDERED];
	
	public int getQtyOrdered() {
		return qtyOrdered;
	}
	public void setQtyOrdered(int qtyOrdered) {
		this.qtyOrdered = qtyOrdered;
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc disc) {
		if(nbOrders < MAX_LIMITTED_ORDERED) {
			if(qtyOrdered == MAX_NUMBER_ORDERED) {
				System.out.println("ERROR! Can't add more DVD!!!");
			}
			else {
				itemsOrdered[qtyOrdered] = disc;
				qtyOrdered++;
				System.out.println("ADDED SUCCESSFULLY DVD: " + disc.getTitle());
			}
			nbOrders++;
		}
		else {
			System.out.println("ERROR!!! Cant add more DVD");
		}
		
	}
	
	public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
		if(qtyOrdered == 0) {
			System.out.println("ERROR!!! Dont have DVD in memory!");
		}
		else {
			
			for(int i = 0; i < qtyOrdered; i++) {
				if(itemsOrdered[i] == disc) {
					for(int j = i + 1; j < qtyOrdered - 1; j++) {
						itemsOrdered[i] = itemsOrdered[j];
					}
					qtyOrdered--;
				}	
			}
			System.out.println("DELETED SUCCESSFULLY DVD: " + disc.getTitle());
		}
		nbOrders--;	
	}
	
	public float totalCost() {
		float totalCost = 0.0f;
		for(int i = 0; i < qtyOrdered; i++) {
			totalCost += itemsOrdered[i].getCost();
		}
		return totalCost;
	}
	public float totalCost(DigitalVideoDisc disc[]) {
		float totalCost = 0.0f;
		for(int i  = 0; i < disc.length; i++) {
			totalCost += disc[i].getCost();
		}
		return totalCost;
	}
	
	public void addDigtalVideoDisc(DigitalVideoDisc[] dvdList) {	
		if(nbOrders < MAX_LIMITTED_ORDERED) {
			if(qtyOrdered + dvdList.length > MAX_NUMBER_ORDERED) {
				System.out.println("ERROR!!! Can't add more DVD!!!");
			}
			else {
				for(int i = 0; i < dvdList.length; i++) {
					this.itemsOrdered[qtyOrdered++] = dvdList[i];
				}
				System.out.println("\nSuccessfully added dvdList!!!");
			}
			nbOrders++;
		}
		else {
			System.out.println("ERROR!!!");
		}
	}
	
	public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
		if(nbOrders > MAX_LIMITTED_ORDERED) {
			if(qtyOrdered > MAX_NUMBER_ORDERED - 2) {
				System.out.println("ERRER!!! Can't add more DVD!!!");
			}
			else {
				this.addDigitalVideoDisc(dvd1);
				this.addDigitalVideoDisc(dvd2);
				System.out.println("Successfully added Dvd1 & Dvd2");
			}
			nbOrders++;
		}
		else {
			System.out.println("ERROR!!!");
		}
	}

	public void printOrder(DigitalVideoDisc[] dvdList) {
		System.out.println("*********************************ORDER********************************");
		float price = 0.0f;
		System.out.println("Date: " + dvdList[0].getDateOrdered().getDay() + "/" + dvdList[0].getDateOrdered().getMonth() + "/" + dvdList[0].getDateOrdered().getYear());
		for(int i = 0; i < dvdList.length; i++) {
			System.out.println((i+1) + ". DVD " + dvdList[i].getTitle() + " - " + dvdList[i].getCategory() + " - " +
								dvdList[i].getDirector() + " - " + dvdList[i].getLength() + " - " + dvdList[i].getCost() + "$");
			price += dvdList[i].getCost();
		}
		System.out.println("Total Cost: " + price + "$");
		System.out.println("**********************************************************************");
	}

	public DigitalVideoDisc getLuckyItem(DigitalVideoDisc[] dvdList)
	{
		DigitalVideoDisc disc = new DigitalVideoDisc();
		int i = (int) (Math.random()*10);
		disc = dvdList[i];
		disc.setCost(0.0f);
        System.out.println("\nCongratulations! Your Lucky Item is: DVD " + dvdList[i].getTitle() + "\n");
		return disc;
	}
}

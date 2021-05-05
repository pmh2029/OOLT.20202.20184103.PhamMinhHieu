import java.util.ArrayList;
//import java.util.Scanner;
import java.util.Collections;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
//import java.util.Comparator;

import disc.*;
import media.*;
import order.*;
import utils.*;

public class Test
{
    
    public static void main(String[] args) {
        
        /****************************************************** Data ******************************************************/

        ArrayList<String> authorsList1 = new ArrayList<String>();
        ArrayList<String> authorsList2 = new ArrayList<String>();
        ArrayList<String> authorsList3 = new ArrayList<String>();
        ArrayList<String> authorsList4 = new ArrayList<String>(); 

        authorsList1.add("Tony buoi sang");
        authorsList2.add("Tony buoi trua");
        authorsList2.add("Tony buoi chieu");
        authorsList3.add("Tony buoi toi");
        authorsList3.add("Tony buoi chang vang");
        authorsList3.add("Tony buoi hoang hon");
        authorsList4.add("Tony buá»•i binh minh");
        authorsList4.add("Tony buoi xe chieu");

        Book b1 = new Book(9, "Tren duong bang", "SelfHelp", 159.55f, authorsList1);
        Book b2 = new Book(10, "Tren duong cao toc", "Racer", 194.54f, authorsList2);
        Book b3 = new Book(11, "Tren duong toan o ga", "The traffic of Vietnam", 114.54f, authorsList3);
        Book b4 = new Book(12, "Tren duong dan sinh", "The traffic hack", 56.54f, authorsList4);

        ArrayList<Track> trackList1 = new ArrayList<Track>();
        ArrayList<Track> trackList2 = new ArrayList<Track>();

        Disc disc1 = new Disc(1, "Son Tung M-TP", "Underground", "Trong dep trai", 12 ,19.25f);

        DigitalVideoDisc dvd1 = new DigitalVideoDisc(21, "DDD", "Hip Hop", "Trong dep trai", 36, 25.20f);
        DigitalVideoDisc dvd2 = new DigitalVideoDisc(22, "AAA", "Hip Hop", "Trong dep trai", 36, 23.20f);
        DigitalVideoDisc dvd3 = new DigitalVideoDisc(23, "CCA", "Hip Hop", "Trong dep trai", 36, 251.20f);
        DigitalVideoDisc dvd4 = new DigitalVideoDisc(23, "CCB", "Hip Hop", "Trong dep trai", 36, 95.20f);

        trackList1.add(new Track("Thu do Cypher", 15));
        trackList1.add(new Track("Rap cham thoi", 19));
        trackList1.add(new Track("Tan gai 707", 22));
        trackList2.add(new Track("Con mua ngang qua", 31));
        trackList2.add(new Track("Nang am xa dan", 17));
        
        CompactDisc cd1 = new CompactDisc(3, "Hip Hop never die", "Hip Hop", "Trong dep trai", "Low G ft MCK", 15, 99.05f, trackList1);
        CompactDisc cd2 = new CompactDisc(4, "Son Tung M-TP", "Underground", "Trong dep trai", "Nguyen Son Tung", 13, 19.25f, trackList2);

        
        Collection<Media> collection = new ArrayList<>(); // up_casting ArrayList --> Collection  
        
        
        collection.add(disc1);
        collection.add(dvd1);
        collection.add(dvd2);
        collection.add(dvd3);
        collection.add(dvd4);
        collection.add(cd1);
        collection.add(cd2);

        /****************************************************** Collection Test ******************************************************/

        /*Iterator<Media> iterator = collection.iterator(); // dĂ¹ng ná»™i dung cá»§a collection báº±ng iterator

        System.out.println("---------------------------------------");

        System.out.println("The DVDs currently in the order are: ");


        while (iterator.hasNext()) {
            Media mediaCheck = (Media)iterator.next();
            System.out.println(mediaCheck.getCost() + " ### " + mediaCheck.getTitle());
        }
     
        if (collection instanceof List) {
            Collections.sort((List)collection);
        }
        else {
            System.out.println("Can't sort this collection");
        }
        
        iterator = collection.iterator();

        System.out.println("---------------------------------------");
        System.out.println("The DVDs in sorted order are: ");

        while (iterator.hasNext()) {
            Media mediaCheck = (Media)iterator.next();
            System.out.println(mediaCheck.getCost() + " ### " + mediaCheck.getTitle());
        }
        */
        /****************************************************** Book content Test ******************************************************/

        b1.setContent("A BB C D, A A.\n B D C BB E . F.G, H H\tA B");

        //b1.setContentTokens();
        b1.setWordFrequency();
        
        System.out.println(b1.toString());
    }    
}
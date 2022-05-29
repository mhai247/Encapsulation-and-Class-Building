package aims;

import aims.media.DigitalVideoDisc;
import aims.media.Media;
import aims.order.Order;
import aims.media.Book;

import java.util.Collections;
import java.util.Scanner;

public class Aims {
    public static void showMenu() {
        System.out.println("Order Management Application");
        System.out.println("----------------------------");
        System.out.println("1. Create new order");
        System.out.println("2. Add item to the order");
        System.out.println("3. Delete item by id");
        System.out.println("4. Display the items list of order");
        System.out.println("0. Exit");
        System.out.println("----------------------------");
        System.out.println("Please choose a number: 0-1-2-3-4");
    }
    public static void main(String[] args){
        Media[] mediaList = new Media[5];
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        mediaList[0] = dvd1;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        mediaList[1] = dvd2;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        mediaList[2] = dvd3;
        Book book1 = new Book(Collections.singletonList("John"));
        book1.setCategory("Art Book");
        book1.setTitle("Hello World");
        book1.setCost(15.35f);
        mediaList[3] = book1;
        Book book2 = new Book(Collections.singletonList("Elena"));
        book2.setCategory("Comic");
        book2.setTitle("Naruto");
        book2.setCost(10.25f);
        mediaList[4] = book2;

        int menu = -1, mediaItem;
        Order order = new Order();
        while (menu != 0) {
            showMenu();
            Scanner scan = new Scanner(System.in);
            menu = scan.nextInt();
            switch (menu)
            {
                case 1:
                    order = new Order();
                    System.out.println("Successful!");
                    break;
                case 2:
                    System.out.println("Enter id to add: 0-1-2-3-4");
                    mediaItem = scan.nextInt();
                    order.addMedia(mediaList[mediaItem]);
                    System.out.println("Successful!");
                    break;
                case 3:
                    System.out.println("Enter id to remove: 0-1-2-3-4");
                    mediaItem = scan.nextInt();
                    order.removeMedia(mediaList[mediaItem]);
                    break;
                case 4:
                    order.printOrder();
            }
        }//            Order o1 = new Order();
//            Order o4 = new Order();
//            Order o5 = new Order();
//            Order o6 = new Order();
    }
}

package aims.order;

import java.time.LocalDate;
import java.util.ArrayList;
//import aims.disc/aims.media.DigitalVideoDisc.java;
import aims.media.DigitalVideoDisc;
import aims.media.Media;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;

    private static int nbOrders = 0;
    private ArrayList<Media> itemsOrdered = new ArrayList<Media>();
    private LocalDate dateOrdered;

    public Order() {
        if (nbOrders == MAX_LIMITED_ORDERS)
            throw new IndexOutOfBoundsException("Number of orders is full");
        this.dateOrdered = java.time.LocalDate.now();
        nbOrders++;
    }

    public void addMedia(Media item){
        this.itemsOrdered.add(item);
        System.out.println("The item has been added");
    }

    public void removeMedia(Media item) {
        if (this.itemsOrdered.indexOf(item) != -1)
        {
            this.itemsOrdered.remove(item);
            System.out.println("The item has been removed");
        }
        else
            System.out.println("Item not exist");
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < this.itemsOrdered.size(); ++i)
            sum += this.itemsOrdered.get(i).getCost();
        return sum;
    }

    public void printOrder() {
        System.out.println("***********************Order***********************");
        System.out.println("Date: " + this.dateOrdered);
        System.out.println("Ordered items:");
        for (int i = 0; i < this.itemsOrdered.size(); ++i)
            System.out.println(i + ". " + this.itemsOrdered.get(i).getTitle()
            + " - " + this.itemsOrdered.get(i).getCategory()
            + ": " + this.itemsOrdered.get(i).getCost() + "$");
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }

//    public DigitalVideoDisc getALuckyItem() {
//        DigitalVideoDisc dvd = this.itemsOrdered[(int)(Math.random() * this.qtyOrdered)];
//        dvd.setCost(0);
//        return dvd;
//    }
}

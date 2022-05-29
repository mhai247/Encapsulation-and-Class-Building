package aims.order;

import java.time.LocalDate;
//import aims.disc/aims.disc.DigitalVideoDisc.java;
import aims.disc.DigitalVideoDisc;

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;
    public static final int MAX_LIMITED_ORDERS = 5;

    private static int nbOrders = 0;
    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];
    private int qtyOrdered = 0;
    private LocalDate dateOrdered;

    public Order() {
        if (nbOrders == MAX_LIMITED_ORDERS)
            throw new IndexOutOfBoundsException("Number of orders is full");
        this.dateOrdered = java.time.LocalDate.now();
        nbOrders++;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < 10) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The aims.disc has been added");
        }
        else System.out.println("The aims.order is already full");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc... dvdLst) {
        int len = dvdLst.length, i;
        for (i = 0; i < len; ++i) {
            itemsOrdered[qtyOrdered] = dvdLst[i];
            qtyOrdered++;
            if (qtyOrdered == 10)
                break;
        }
        if (i != len){
            System.out.println("Full aims.order list!!");
            System.out.println("Unsuccessful items:");
            for (; i < len; ++i){
                System.out.println(dvdLst[i].getTitle());
            }
        }
        else
            System.out.println("Successful");
    }

    public void addDigitalVideoDisc(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        if (qtyOrdered < 10) {
            itemsOrdered[qtyOrdered] = dvd1;
            qtyOrdered++;
            System.out.print(dvd1.getTitle());
            System.out.println(" has been added");
        }
        else{
            System.out.println("The aims.order is already full");
            System.out.println("Unsuccessful items:");
            System.out.println(dvd1.getTitle());
            System.out.println(dvd2.getTitle());
            return;
        }
        if (qtyOrdered < 10) {
            itemsOrdered[qtyOrdered] = dvd2;
            qtyOrdered++;
            System.out.print(dvd2.getTitle());
            System.out.println(" has been added");
        }
        else{
            System.out.println("The aims.order is already full");
            System.out.println("Unsuccessful items:");
            System.out.println(dvd2.getTitle());
        }
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i;
        for (i = 0; i < qtyOrdered; ++i)
            if (itemsOrdered[i] == disc) {
                for (int j = i + 1; j < qtyOrdered; ++j)
                    itemsOrdered[j - 1] = itemsOrdered[j];
                qtyOrdered--;
                System.out.println("The aims.disc has been removed");
            }
        if (i == qtyOrdered)
            System.out.println("Not found in aims.order");
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; ++i)
            sum += itemsOrdered[i].getCost();
        return sum;
    }

    public void printOrder() {
        System.out.println("***********************aims.order.Order***********************");
        System.out.println("Date: " + this.dateOrdered);
        System.out.println("Ordered items:");
        for (int i = 0; i < this.qtyOrdered; ++i)
            System.out.println(i + ". DVD - " + this.itemsOrdered[i].getTitle()
            + " - " + this.itemsOrdered[i].getCategory()
            + " - " + this.itemsOrdered[i].getDirector()
            + " - " + this.itemsOrdered[i].getLength()
            + ": " + this.itemsOrdered[i].getCost() + "$");
        System.out.println("Total cost: " + this.totalCost());
        System.out.println("***************************************************");
    }

    public DigitalVideoDisc getALuckyItem() {
        DigitalVideoDisc dvd = this.itemsOrdered[(int)(Math.random() * this.qtyOrdered)];
        dvd.setCost(0);
        return dvd;
    }
}

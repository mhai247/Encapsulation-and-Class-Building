package aims;

import aims.order.Order;

public class Aims {
    public static void main(String[] args){
        aims.order.Order anOrder = new aims.order.Order();
        aims.disc.DigitalVideoDisc dvd1 = new aims.disc.DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        anOrder.addDigitalVideoDisc(dvd1);

        aims.disc.DigitalVideoDisc dvd2 = new aims.disc.DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("Geogre Lucas");
        dvd2.setLength(124);
        anOrder.addDigitalVideoDisc(dvd2);

        aims.disc.DigitalVideoDisc dvd3 = new aims.disc.DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        anOrder.addDigitalVideoDisc(dvd3);

        aims.order.Order anotherOrder = new aims.order.Order();

        aims.disc.DigitalVideoDisc dvd4 = new aims.disc.DigitalVideoDisc("The Lion King 2");
        dvd4.setCategory("Animation");
        dvd4.setCost(19.95f);
        dvd4.setDirector("Roger Allers");
        dvd4.setLength(87);
        anotherOrder.addDigitalVideoDisc(dvd4);

        aims.disc.DigitalVideoDisc dvd5 = new aims.disc.DigitalVideoDisc("Star Wars 2");
        dvd5.setCategory("Science Fiction");
        dvd5.setCost(24.95f);
        dvd5.setDirector("Geogre Lucas");
        dvd5.setLength(124);
        anotherOrder.addDigitalVideoDisc(dvd5);

        aims.disc.DigitalVideoDisc dvd6 = new aims.disc.DigitalVideoDisc("Aladdin 2");
        dvd6.setCategory("Animation");
        dvd6.setCost(18.99f);
        dvd6.setDirector("John Musker");
        dvd6.setLength(90);
        anotherOrder.addDigitalVideoDisc(dvd6);

        anOrder.printOrder();
        anotherOrder.printOrder();
//            Order o1 = new Order();
//            Order o4 = new Order();
//            Order o5 = new Order();
//            Order o6 = new Order();
    }
}

package aims;
import aims.disc.DigitalVideoDisc;
import aims.order.Order;


public class DiskTest {
    public static void main(String[] args){
        Order Order1 = new Order();
//Create new dvd object and set the fields
        DigitalVideoDisc[] dvdList;
        dvdList = new DigitalVideoDisc[3];
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King");
        dvd1.setCategory("Animation");
        dvd1.setCost(19.95f);
        dvd1.setDirector("Roger Allers");
        dvd1.setLength(87);
        dvdList[0] = dvd1;
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars");
        dvd2.setCategory("Science Fiction");
        dvd2.setCost(24.95f);
        dvd2.setDirector("George Lucas");
        dvd2.setLength(124);
        dvdList[1] = dvd2;
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladdin");
        dvd3.setCategory("Animation");
        dvd3.setCost(18.99f);
        dvd3.setDirector("John Musker");
        dvd3.setLength(90);
        dvdList[2] = dvd3;
        Order1.addDigitalVideoDisc(dvdList);
        System.out.println(dvd1.search("Lion The"));
        System.out.println(dvd1.search("The lion"));
        System.out.println(dvd1.search("King Lion The"));
        System.out.println("Before getALuckyItem:");
        Order1.printOrder();
        DigitalVideoDisc luckyDvd = Order1.getALuckyItem();
        System.out.println("Lucky DVD: " + luckyDvd.getTitle());
        System.out.println("After getALuckyItem:");
        Order1.printOrder();
    }
}

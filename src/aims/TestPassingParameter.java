package aims;

import aims.disc.DigitalVideoDisc;

public class TestPassingParameter {
    public static void main(String[] args) {
        DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
        DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");

        swap(jungleDVD, cinderellaDVD);

        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
        System.out.println("Cinderella dvd title: " + cinderellaDVD.getTitle());

//        changeTitle(jungleDVD, cinderellaDVD.getTitle());
//        System.out.println("Jungle dvd title: " + jungleDVD.getTitle());
    }

    public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {
        String tmp;
        tmp = dvd1.getTitle();
        dvd1.setTitle(dvd2.getTitle());
        dvd2.setTitle(tmp);

        tmp = dvd1.getCategory();
        dvd1.setCategory(dvd2.getCategory());
        dvd2.setCategory(tmp);

        tmp = dvd1.getDirector();
        dvd1.setDirector(dvd2.getDirector());
        dvd2.setDirector(tmp);

        int len_tmp;
        len_tmp = dvd1.getLength();
        dvd1.setLength(dvd2.getLength());
        dvd2.setLength(len_tmp);

        float cost_tmp;
        cost_tmp = dvd1.getCost();
        dvd1.setCost(dvd2.getCost());
        dvd2.setCost(cost_tmp);
    }

    public static void changeTitle(DigitalVideoDisc dvd, String title) {
        String oldTitle = dvd.getTitle();
        dvd.setTitle(title);
        dvd = new DigitalVideoDisc(oldTitle);
    }
}

public class Order {
    public static final int MAX_NUMBERS_ORDERED = 10;

    private DigitalVideoDisc[] itemsOrdered = new DigitalVideoDisc[MAX_NUMBERS_ORDERED];

    private static int qtyOrdered = 0;

    public static int getQtyOrdered() {
        return qtyOrdered;
    }

    public static void setQtyOrdered(int qtyOrdered) {
        Order.qtyOrdered = qtyOrdered;
    }

    public void addDigitalVideoDisc(DigitalVideoDisc disc){
        if (qtyOrdered < 10) {
            itemsOrdered[qtyOrdered] = disc;
            qtyOrdered++;
            System.out.println("The disc has been added");
        }
        else System.out.println("The order is already full");
    }

    public void removeDigitalVideoDisc(DigitalVideoDisc disc) {
        int i;
        for (i = 0; i < qtyOrdered; ++i)
            if (itemsOrdered[i] == disc) {
                for (int j = i + 1; j < qtyOrdered; ++j)
                    itemsOrdered[j - 1] = itemsOrdered[j];
                qtyOrdered--;
                System.out.println("The disc has been removed");
            }
        if (i == qtyOrdered)
            System.out.println("Not found in order");
    }

    public float totalCost() {
        float sum = 0;
        for (int i = 0; i < qtyOrdered; ++i)
            sum += itemsOrdered[i].getCost();
        return sum;
    }
}

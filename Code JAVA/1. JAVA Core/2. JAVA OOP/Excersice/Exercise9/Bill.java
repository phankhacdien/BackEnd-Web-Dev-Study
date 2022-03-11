package Exercise9;

public class Bill {
    private HouseHold customer;
    private int old_electricalIndex;
    private int new_electricalIndex;
    private int price;

    public Bill(HouseHold customer, int old_electricalIndex, int new_electricalIndex) {
        this.customer = customer;
        this.old_electricalIndex = old_electricalIndex;
        this.new_electricalIndex = new_electricalIndex;
        this.price = (new_electricalIndex - old_electricalIndex)*5;
    }

    public HouseHold getCustomer() {
        return customer;
    }

    public int getOld_electricalIndex() {
        return old_electricalIndex;
    }

    public int getNew_electricalIndex() {
        return new_electricalIndex;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Bill{" +
                "customer=" + this.customer.toString() +
                ", old_electricalIndex=" + this.old_electricalIndex +
                ", new_electricalIndex=" + this.new_electricalIndex +
                ", price=" + this.price +
                '}';
    }
}

package Exercise5;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Hotel {
    private List<Customer> rooms;

    public Hotel() {
        this.rooms = new ArrayList<Customer>();
    }

    public void insert(Customer customer) {
        this.rooms.add(customer);
    }

    public void delete(String del_id){
        List<Customer> del_customer = this.rooms.stream()
                                    .filter(customer -> customer.getId().equals(del_id))
                                    .collect(Collectors.toList());
        this.rooms.removeAll(del_customer);
    }

    public void payment(String pay_id){
        Customer pay_customer = this.rooms.stream()
                .filter(customer -> customer.getId().equals(pay_id))
                .findFirst().orElse(null);
        int price = pay_customer.getRoom().getPrice()*pay_customer.getRent_period();
        System.out.println("Price: "+ price);
    }
}

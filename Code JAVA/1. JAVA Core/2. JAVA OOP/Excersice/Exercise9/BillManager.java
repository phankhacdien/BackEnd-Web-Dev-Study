package Exercise9;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BillManager {
    private List<Bill> billList;

    public BillManager() {
        this.billList = new ArrayList<Bill>();
    }

    public void insert(Bill new_bill){
        this.billList.add(new_bill);
    }

    public void delete(int del_house){
        List del_ticket = this.billList.stream()
                .filter(bill -> bill.getCustomer().getHouse_number() == del_house)
                .collect(Collectors.toList());
        this.billList.removeAll(del_ticket);
    }

    public void revise(int revise_house, String new_name, int new_house_number, String new_electrical_meterID){
        this.billList.stream()
                .filter(bill -> bill.getCustomer().getHouse_number() == revise_house)
                .forEach(bill -> {
                    bill.getCustomer().setName(new_name);
                    bill.getCustomer().setHouse_number(new_house_number);
                    bill.getCustomer().setElectrical_meterID(new_electrical_meterID);
                });
    }

    public void show(int show_house){
        this.billList.stream()
                .filter(bill -> bill.getCustomer().getHouse_number() == show_house)
                .forEach(bill -> System.out.println(bill.toString()));
    }
}

package Exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Library {
    private List<Ticket> ticketList;

    public Library() {
        this.ticketList = new ArrayList<Ticket>();
    }

    public void insert(Ticket new_ticket){
        this.ticketList.add(new_ticket);
    }

    public void delete(String del_ticketID){
        List del_ticket = this.ticketList.stream()
                .filter(ticket -> ticket.getTicketID().equals(del_ticketID))
                .collect(Collectors.toList());
        this.ticketList.removeAll(del_ticket);
    }

    public void show(String show_ticketID){
        this.ticketList.stream()
                .filter(ticket -> ticket.getTicketID().equals(show_ticketID))
                .forEach(ticket -> System.out.println(ticket.toString()));
    }
}

package Exercise8;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Ticket {
    private String ticketID;
    private Date borrow_date;
    private String bookID;
    private Student student;

    public Ticket(String ticketID, Date borrow_date, String bookID, Student student) {
        this.ticketID = ticketID;
        this.borrow_date = borrow_date;
        this.bookID = bookID;
        this.student = student;
    }

    public String getTicketID() {
        return this.ticketID;
    }

    public Date getBorrow_date() {
        return this.borrow_date;
    }

    public String getBookID() {
        return this.bookID;
    }

    public Student getStudent() {
        return this.student;
    }

    @Override
    public String toString() {
        DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm");
        return "Ticket{" +
                "ticketID='" + this.ticketID + '\'' +
                ", borrow_date='" + df.format(this.borrow_date) + '\'' +
                ", bookID='" + this.bookID + '\'' +
                ", student=" + this.student.toString() +
                '}';
    }
}

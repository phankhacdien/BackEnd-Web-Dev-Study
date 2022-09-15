package Entity;

public class Book extends Document{
    private String author;
    private int qtyPageNumber;

    public Book(String documentName, String documentID, String producer, int quantity, String author, int qtyPageNumber) {
        super(documentName, documentID, producer, quantity);
        this.author = author;
        this.qtyPageNumber = qtyPageNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", qtyPageNumber=" + qtyPageNumber +
                ", documentName='" + documentName + '\'' +
                ", documentID='" + documentID + '\'' +
                ", producer='" + producer + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getQtyPageNumber() {
        return qtyPageNumber;
    }

    public void setQtyPageNumber(int qtyPageNumber) {
        this.qtyPageNumber = qtyPageNumber;
    }
}

package Exercise2;

public class Book extends Document {
    protected int page_qty;

    Book(String doc_barcode, String introducer, int release_number, int page_qty) {
        super(doc_barcode, introducer, release_number);
        this.page_qty = page_qty;
    }

    @Override
    public String toString() {
        return "Book{" +
                "page_qty=" + page_qty +
                ", doc_barcode='" + doc_barcode + '\'' +
                ", introducer='" + introducer + '\'' +
                ", release_number=" + release_number +
                '}';
    }
}

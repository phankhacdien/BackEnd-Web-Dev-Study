public class Book extends Document {
    protected int number_page;

    Book(String doc_barcode, String introducer, int release_number, int page_qty) {
        super(doc_barcode, introducer, release_number);
        this.number_page = page_qty;
    }
}

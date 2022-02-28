public class Book extends Document {
    private int page_number;

    Book(int doc_barcode, String introducer, int release_number, int page_number) {
        super(doc_barcode, introducer, release_number);
        this.page_number = page_number;
    }
}

public class Magazine extends Book {
    private int release_no;
    private String release_month;

    Magazine(int doc_barcode, String introducer, int release_number, int page_number, int release_no, String release_month) {
        super(doc_barcode, introducer, release_number, page_number);
        this.release_no = release_no;
        this.release_month = release_month;
    }
}

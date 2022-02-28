public class Newspaper extends Magazine {
    private int release_day;

    Newspaper(int doc_barcode, String introducer, int release_number, int page_number, int release_no, String release_month, int release_day) {
        super(doc_barcode, introducer, release_number, page_number, release_no, release_month);
        this.release_day = release_day;
    }
}

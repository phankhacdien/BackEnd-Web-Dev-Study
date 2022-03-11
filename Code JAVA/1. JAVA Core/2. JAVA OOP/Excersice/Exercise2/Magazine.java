package Exercise2;

import java.time.Month;

public class Magazine extends Book {
    protected int release_no;
    protected Month release_month;

    Magazine(String doc_barcode, String introducer, int release_number, int page_qty, int release_no, Month release_month) {
        super(doc_barcode, introducer, release_number, page_qty);
        this.release_no = release_no;
        this.release_month = release_month;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "page_qty=" + page_qty +
                ", doc_barcode='" + doc_barcode + '\'' +
                ", introducer='" + introducer + '\'' +
                ", release_number=" + release_number +
                ", release_no=" + release_no +
                ", release_month='" + release_month + '\'' +
                '}';
    }
}

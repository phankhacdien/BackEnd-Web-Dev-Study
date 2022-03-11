package Exercise2;

import java.time.Month;

public class Newspaper extends Magazine {
    private int release_day;

    Newspaper(String doc_barcode, String introducer, int release_number, int page_qty, int release_no, Month release_month, int release_day) {
        super(doc_barcode, introducer, release_number, page_qty, release_no, release_month);
        this.release_day = release_day;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "page_qty=" + page_qty +
                ", doc_barcode='" + doc_barcode + '\'' +
                ", introducer='" + introducer + '\'' +
                ", release_number=" + release_number +
                ", release_no=" + release_no +
                ", release_month='" + release_month + '\'' +
                ", release_day=" + release_day +
                '}';
    }
}

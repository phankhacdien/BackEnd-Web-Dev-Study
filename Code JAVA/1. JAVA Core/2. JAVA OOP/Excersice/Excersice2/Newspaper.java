package Excersice2;

import Excersice2.Magazine;

public class Newspaper extends Magazine {
    private int release_day;

    Newspaper(String doc_barcode, String introducer, int release_number, int page_qty, int release_no, String release_month, int release_day) {
        super(doc_barcode, introducer, release_number, page_qty, release_no, release_month);
        this.release_day = release_day;
    }
}

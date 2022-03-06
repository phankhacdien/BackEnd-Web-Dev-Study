package Excersice2;

import Excersice2.Book;

public class Magazine extends Book {
    protected int release_no;
    protected String release_month;

    Magazine(String doc_barcode, String introducer, int release_number, int page_qty, int release_no, String release_month) {
        super(doc_barcode, introducer, release_number, page_qty);
        this.release_no = release_no;
        this.release_month = release_month;
    }
}

public class Document {
    private int doc_barcode;
    private String introducer;
    private int release_number;

    Document(int doc_barcode, String introducer, int release_number){
        this.doc_barcode = doc_barcode;
        this.introducer = introducer;
        this.release_number = release_number;
    }
}

package Exercise2;

public class Document {
    protected String doc_barcode;
    protected String introducer;
    protected int release_number;

    Document(String doc_barcode, String introducer, int release_number){
        this.doc_barcode = doc_barcode;
        this.introducer = introducer;
        this.release_number = release_number;
    }

    @Override
    public String toString() {
        return "Document{" +
                "doc_barcode='" + doc_barcode + '\'' +
                ", introducer='" + introducer + '\'' +
                ", release_number=" + release_number +
                '}';
    }
}
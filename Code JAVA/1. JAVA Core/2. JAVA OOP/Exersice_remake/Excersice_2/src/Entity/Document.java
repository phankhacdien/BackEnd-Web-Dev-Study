package Entity;

public class Document {
    protected String documentName;
    protected String documentID;
    protected String producer;
    protected int quantity;

    public Document(String documentName, String documentID, String producer, int quantity) {
        this.documentName = documentName;
        this.documentID = documentID;
        this.producer = producer;
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Document{" +
                "documentName='" + documentName + '\'' +
                ", documentID='" + documentID + '\'' +
                ", producer='" + producer + '\'' +
                ", quantity=" + quantity +
                '}';
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

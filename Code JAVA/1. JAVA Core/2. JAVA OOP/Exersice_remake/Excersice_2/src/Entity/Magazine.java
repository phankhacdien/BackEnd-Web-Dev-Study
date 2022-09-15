package Entity;

import java.time.Month;

public class Magazine extends Document{
    private int circulationNo;
    private Month circulationMonth;

    public Magazine(String documentName, String documentID, String producer, int quantity, int circulationNo, Month circulationMonth) {
        super(documentName, documentID, producer, quantity);
        this.circulationNo = circulationNo;
        this.circulationMonth = circulationMonth;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "documentName='" + documentName + '\'' +
                ", documentID='" + documentID + '\'' +
                ", producer='" + producer + '\'' +
                ", quantity=" + quantity +
                ", circulationNo=" + circulationNo +
                ", circulationMonth=" + circulationMonth +
                '}';
    }

    public int getCirculationNo() {
        return circulationNo;
    }

    public void setCirculationNo(int circulationNo) {
        this.circulationNo = circulationNo;
    }

    public Month getCirculationMonth() {
        return circulationMonth;
    }

    public void setCirculationMonth(Month circulationMonth) {
        this.circulationMonth = circulationMonth;
    }
}

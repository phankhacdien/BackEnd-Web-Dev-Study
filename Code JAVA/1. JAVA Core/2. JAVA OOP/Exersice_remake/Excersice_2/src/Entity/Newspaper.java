package Entity;

import java.time.LocalDate;

public class Newspaper extends Document {
    private int circulationDay;

    public Newspaper(String documentName, String documentID, String producer, int quantity, int circulationDay) {
        super(documentName, documentID, producer, quantity);
        this.circulationDay = circulationDay;
    }

    @Override
    public String toString() {
        return "Newspaper{" +
                "documentName='" + documentName + '\'' +
                ", documentID='" + documentID + '\'' +
                ", producer='" + producer + '\'' +
                ", quantity=" + quantity +
                ", circulationDay=" + circulationDay +
                '}';
    }

    public int getCirculationDay() {
        return circulationDay;
    }

    public void setCirculationDay(int circulationDay) {
        this.circulationDay = circulationDay;
    }
}

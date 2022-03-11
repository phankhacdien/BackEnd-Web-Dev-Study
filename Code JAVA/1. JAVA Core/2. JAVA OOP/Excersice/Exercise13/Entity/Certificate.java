package Exercise13.Entity;

import java.time.LocalDate;
import java.util.Date;

public class Certificate {
    private String certificateName;
    private String certificateID;
    private int certificateRank;
    private LocalDate certificateDate;

    public Certificate(String certificateName, String certificateID, int certificateRank, LocalDate certificateDate) {
        this.certificateName = certificateName;
        this.certificateID = certificateID;
        this.certificateRank = certificateRank;
        this.certificateDate = certificateDate;
    }

    @Override
    public String toString() {
        return "Certificate{" +
                "certificateName='" + certificateName + '\'' +
                ", certificateID='" + certificateID + '\'' +
                ", certificateRank=" + certificateRank +
                ", certificateDate=" + certificateDate +
                '}';
    }

    public String getCertificateName() {
        return certificateName;
    }

    public String getCertificateID() {
        return certificateID;
    }

    public int getCertificateRank() {
        return certificateRank;
    }

    public LocalDate getCertificateDate() {
        return certificateDate;
    }

    public void setCertificateName(String certificateName) {
        this.certificateName = certificateName;
    }

    public void setCertificateID(String certificateID) {
        this.certificateID = certificateID;
    }

    public void setCertificateRank(int certificateRank) {
        this.certificateRank = certificateRank;
    }

    public void setCertificateDate(LocalDate certificateDate) {
        this.certificateDate = certificateDate;
    }
}

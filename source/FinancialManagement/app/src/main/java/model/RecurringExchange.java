package model;

import java.util.Date;

public class RecurringExchange {
    private int id;
    private int idJarUser;
    private int idResource;
    private int termType;
    private int type;
    private String note;
    private double amount;
    private Date dateFound;

    public RecurringExchange(int id, int idJarUser, int idResource, int termType, int type, String note, double amount, Date dateFound) {
        this.id = id;
        this.idJarUser = idJarUser;
        this.idResource = idResource;
        this.termType = termType;
        this.type = type;
        this.note = note;
        this.amount = amount;
        this.dateFound = dateFound;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJarUser() {
        return idJarUser;
    }

    public void setIdJarUser(int idJarUser) {
        this.idJarUser = idJarUser;
    }

    public int getIdResource() {
        return idResource;
    }

    public void setIdResource(int idResource) {
        this.idResource = idResource;
    }

    public int getTermType() {
        return termType;
    }

    public void setTermType(int termType) {
        this.termType = termType;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getDateFound() {
        return dateFound;
    }

    public void setDateFound(Date dateFound) {
        this.dateFound = dateFound;
    }

    @Override
    public String toString() {
        return "RecurringExchange{" +
                "id=" + id +
                ", idJarUser=" + idJarUser +
                ", idResource=" + idResource +
                ", termType=" + termType +
                ", type=" + type +
                ", note='" + note + '\'' +
                ", amount=" + amount +
                ", dateFound=" + dateFound +
                '}';
    }
}

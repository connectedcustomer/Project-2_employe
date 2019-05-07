package model;

import java.util.Date;

public class Exchange {
    private int id;
    private int idJarUser;
    private int idResource;
    private int type;
    private double amount;
    private String note;
    private Date date;

    public Exchange(int id, int idJarUser, int idResource, int type, double amount, String note, Date date) {
        this.id = id;
        this.idJarUser = idJarUser;
        this.idResource = idResource;
        this.type = type;
        this.amount = amount;
        this.note = note;
        this.date = date;
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

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Exchange{" +
                "id=" + id +
                ", idJarUser=" + idJarUser +
                ", idResource=" + idResource +
                ", type=" + type +
                ", amount=" + amount +
                ", note='" + note + '\'' +
                ", date=" + date +
                '}';
    }
}

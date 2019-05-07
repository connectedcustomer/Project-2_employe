package model;

import java.util.Date;

public class SavingPlan {
    private int idPlan;
    private int idUser;
    private double amount;
    private Date startDate;
    private Date endDate;
    private String note;

    public SavingPlan(int idPlan, int idUser, double amount, Date startDate, Date endDate, String note) {
        this.idPlan = idPlan;
        this.idUser = idUser;
        this.amount = amount;
        this.startDate = startDate;
        this.endDate = endDate;
        this.note = note;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "SavingPlan{" +
                "idPlan=" + idPlan +
                ", idUser=" + idUser +
                ", amount=" + amount +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", note='" + note + '\'' +
                '}';
    }
}

package model;

public class MoneyJarUserDetail {
    private int id;
    private int idJar;
    private int idUser;
    private int percent;
    private double budget;

    public MoneyJarUserDetail(int id, int idJar, int idUser, int percent, double budget) {
        this.id = id;
        this.idJar = idJar;
        this.idUser = idUser;
        this.percent = percent;
        this.budget = budget;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdJar() {
        return idJar;
    }

    public void setIdJar(int idJar) {
        this.idJar = idJar;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public int getPercent() {
        return percent;
    }

    public void setPercent(int percent) {
        this.percent = percent;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "MoneyJarUserDetail{" +
                "id=" + id +
                ", idJar=" + idJar +
                ", idUser=" + idUser +
                ", percent=" + percent +
                ", budget=" + budget +
                '}';
    }
}

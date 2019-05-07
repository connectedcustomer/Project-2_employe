package model;

public class MoneyJar {
    private int idJar;
    private String description;
    private String name;

    public MoneyJar(){

    }

    public MoneyJar(int idJar, String description, String name) {
        this.idJar = idJar;
        this.description = description;
        this.name = name;
    }

    public int getIdJar() {
        return idJar;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public void setIdJar(int idJar) {
        this.idJar = idJar;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MoneyJar{" +
                "idJar=" + idJar +
                ", description='" + description + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}

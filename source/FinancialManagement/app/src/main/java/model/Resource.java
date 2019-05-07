package model;

public class Resource {
    private int id;
    private int idJar;
    private String desciption;
    private String name;
    private boolean type;

    public Resource(int id, int idJar, String desciption, String name, boolean type) {
        this.id = id;
        this.idJar = idJar;
        this.desciption = desciption;
        this.name = name;
        this.type = type;
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

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isType() {
        return type;
    }

    public void setType(boolean type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Resource{" +
                "id=" + id +
                ", idJar=" + idJar +
                ", desciption='" + desciption + '\'' +
                ", name='" + name + '\'' +
                ", type=" + type +
                '}';
    }
}

package ru.oiuno;

public class Client {
    private Integer id;
    private String fullName;

    public Client(Integer id, String fullName) {
        this.id = id;
        this.fullName = fullName;
    }
    public Client() {

    }



    public Integer getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
}

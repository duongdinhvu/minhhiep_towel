package mhtowel.dto;

public class Towel {
    private int id;
    private int idType;
    private String towelName;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getIdType() {
        return idType;
    }

    public void setIdType(int idType) {
        this.idType = idType;
    }

    public String getTowelName() {
        return towelName;
    }

    public void setTowelName(String towelName) {
        this.towelName = towelName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

package saba.kikvidze.model;


import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Currency {
    private String name;
    private String description;
    private double value;

    public Currency() {

    }

    public Currency(String name, double value, String description) {
        this.name = name;
        this.value = value;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }
}

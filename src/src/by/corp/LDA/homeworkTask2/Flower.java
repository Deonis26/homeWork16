package by.corp.LDA.homeworkTask2;

import by.corp.LDA.homeworkTask1.Student;

import java.util.Objects;

public class Flower extends Product {
    private String name;
    private byte stemLength;
    private byte numberOfBuds;
    private String budColor;

    public Flower(String name, byte stemLength, byte numberOfBuds, String budColor, String flowerName, int prise) {
        super(flowerName, prise);
        this.name = name;
        this.stemLength = stemLength;
        this.numberOfBuds = numberOfBuds;
        this.budColor = budColor;
    }

    public int hashCode() {
        return name.hashCode() + (int) stemLength * 99 + (int) numberOfBuds + budColor.hashCode();
    }

    @Override
    public boolean equals(Object object) {
        Flower flower;
        if (object instanceof Flower) {
            flower = (Flower) object;
        } else {
            return false;
        }
        if (name.equals(flower.getName()) && budColor.equals(flower.getBudColor()) && stemLength == (flower.getStemLength())
                && numberOfBuds == (flower.getNumberOfBuds())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Flower{" +
                "name='" + name + '\'' +
                ", stemLength=" + stemLength +
                ", numberOfBuds=" + numberOfBuds +
                ", budColor='" + budColor + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public byte getStemLength() {
        return stemLength;
    }

    public void setStemLength(byte stemLength) {
        this.stemLength = stemLength;
    }

    public byte getNumberOfBuds() {
        return numberOfBuds;
    }

    public void setNumberOfBuds(byte numberOfBuds) {
        this.numberOfBuds = numberOfBuds;
    }

    public String getBudColor() {
        return budColor;
    }

    public void setBudColor(String budColor) {
        this.budColor = budColor;
    }
}

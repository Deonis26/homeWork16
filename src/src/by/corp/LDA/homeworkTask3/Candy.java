package by.corp.LDA.homeworkTask3;

import java.util.Objects;

enum CandyType {
    CHOCOLATE,
    WAFFLE,
    CARAMEL
}

public class Candy extends Product {

    private String brand;
    private int volume;
    private String expirationDate;
    private CandyType type;

    public Candy(int price, byte weight, String name, byte discount, String brand, int volume, String expirationDate, CandyType type) {
        super(price, weight, name, discount);
        this.brand = brand;
        this.volume = volume;
        this.expirationDate = expirationDate;
        this.type = type;

    }

    public CandyType getType() {
        return type;
    }

    public void setType(CandyType type) {
        this.type = type;
    }

    @Override
    public int getPrice() {
        return super.getPrice();
    }

    @Override
    public byte getWeight() {
        return super.getWeight();
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public byte getDiscount() {
        return super.getDiscount();
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    @Override
    public String toString() {
        return "Candy {" +
                "name='" + getName() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", discount='" + getDiscount() + '\'' +
                ", prise='" + getPrice() + '\'' +
                ", brand='" + brand + '\'' +
                ", volume=" + volume +
                ", expirationDate='" + expirationDate + '\'' +
                ", CandyType='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Candy candy;
        if (object instanceof Candy) {
            candy = (Candy) object;
        } else {
            return false;
        }
        if (super.equals(candy.getName()) && super.equals(candy.getPrice()) && super.equals(candy.getWeight()) && super.equals(candy.getDiscount())
        && brand.equals(candy.getBrand()) && expirationDate.equals(candy.getExpirationDate()) && volume==(candy.getVolume()) && type==(candy.getType())){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (super.hashCode())+ brand.hashCode()+ volume*30+ expirationDate.hashCode()+type.hashCode();
    }
}


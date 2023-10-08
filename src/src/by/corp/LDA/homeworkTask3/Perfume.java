package by.corp.LDA.homeworkTask3;

public class Perfume extends Product {
    private String brand;
    private int volume;
    private String expirationDate;

    public Perfume(int price, byte weight, String name, byte discount, String brand, int volume, String expirationDate) {
        super(price, weight, name, discount);
        this.brand = brand;
        this.volume = volume;
        this.expirationDate = expirationDate;
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

    public boolean equals(Object object) {
        Perfume perfume;
        if (object instanceof Perfume) {
            perfume = (Perfume) object;
        } else {
            return false;
        }
        if (super.equals(perfume.getName()) && super.equals(perfume.getPrice()) && super.equals(perfume.getWeight()) && super.equals(perfume.getDiscount())
                && brand.equals(perfume.getBrand()) && expirationDate.equals(perfume.getExpirationDate()) && volume == (perfume.getVolume())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (super.hashCode()) + brand.hashCode() + volume * 30 + expirationDate.hashCode();
    }
}

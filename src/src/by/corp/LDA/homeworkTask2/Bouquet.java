package by.corp.LDA.homeworkTask2;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Bouquet extends Product {
    private int prise;
    private String name;
    private List<Flower> flowers;
    private List<Accessory> accessories;

    public Bouquet(int prise, String name) {
        super(name, prise);
        this.prise = prise;
        this.name = name;
        this.flowers = new ArrayList<>();
        this.accessories = new ArrayList<>();
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        Bouquet bouquet;
        if (object instanceof Bouquet) {
            bouquet = (Bouquet) object;
        } else {
            return false;
        }
        if (name.equals(bouquet.getName()) && prise == (bouquet.getPrise())) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return name.hashCode() + prise * 100;
    }

    @Override
    public String toString() {
        return "Bouquet{" +
                "prise=" + prise +
                ", name='" + name + '\'' +
                '}';
    }


    public void addFlower(Flower flower) {
        if (flowers.size() >= 3) {
            throw new IllegalStateException("Нельзя добавлять больше 3 цветов");
        }
        flowers.add(flower);
    }
    public void addAccessory(Accessory accessory) {
        if (accessories.size() >= 3) {
            throw new IllegalStateException("Нельзя добавлять больше 3 одинаковых аксесуаров");
        }
        accessories.add(accessory);
    }

    public double getTotalPrice() {
        double totalPrice = getPrise();
        for (Flower flower : flowers) {
            totalPrice += flower.getPrise();
        }
        for (Accessory accessory : accessories) {
            totalPrice += accessory.getPrise();
        }
        return totalPrice;
    }

}

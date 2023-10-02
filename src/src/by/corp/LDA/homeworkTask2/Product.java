package by.corp.LDA.homeworkTask2;

import java.util.Objects;

public class Product {
    private String name;
    private int prise;

    public Product(String name, int prise) {
        this.name = name;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", prise=" + prise +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        Product product;
        if (object instanceof Product) {
            product = (Product) object;
        } else {
            return false;
        }
        if (name.equals(product.getName()) && prise == (product.getPrise())) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public int hashCode() {
        return name.hashCode()+prise*99;
    }
}
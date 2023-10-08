package by.corp.LDA.homeworkTask3;


public class Product {
    private int price;
    private byte weight;
    private String name;
    private byte discount;

    public Product(int price, byte weight, String name, byte discount) {
        this.price = price;
        this.weight = weight;
        this.name = name;
        this.discount=discount;
    }

    public byte getDiscount() {
        return discount;
    }
    public void setDiscount(byte discount){
        this.discount=discount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public byte getWeight() {
        return weight;
    }

    public void setWeight(byte weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object object) {
        Product product;
        if (object instanceof Product) {
            product = (Product) object;
        } else {
            return false;
        }
        if (name.equals(product.getName()) && price==(product.getPrice()) && weight==(product.getWeight()) && discount==(product.getDiscount())){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Product{" +
                "price=" + price +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", discount=" + discount +
                '}';
    }

    @Override
    public int hashCode() {
        return price * 30 + weight * 30 + name.hashCode()+discount*30;


    }
}

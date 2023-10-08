package by.corp.LDA.homeworkTask3;

enum ChildrenToyType {
    SOFT,
    HARD
}

public class ChildrenToy extends Product {
    private ChildrenToyType type;
    private String description;

    public ChildrenToy(int price, byte weight, String name, byte discount, String description, ChildrenToyType type) {
        super(price, weight, name, discount);
        this.description = description;
        this.type=type;
    }

    public ChildrenToyType getType() {
        return type;
    }

    public void setType(ChildrenToyType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String toString() {
        return "ChildrenToy {" +
                "name='" + getName() + '\'' +
                ", weight='" + getWeight() + '\'' +
                ", discount='" + getDiscount() + '\'' +
                ", prise='" + getPrice() + '\'' +
                ", description='" + description + '\'' +
                ", ChildrenType='" + type + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object object) {
        ChildrenToy childrenToy;
        if (object instanceof ChildrenToy) {
            childrenToy = (ChildrenToy) object;
        } else {
            return false;
        }
        if (super.equals(childrenToy.getName()) && super.equals(childrenToy.getPrice()) && super.equals(childrenToy.getWeight()) && super.equals(childrenToy.getDiscount())
                && description.equals(childrenToy.getDescription()) && type==childrenToy.getType()) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public int hashCode() {
        return (super.hashCode()) + description.hashCode()+type.hashCode();
    }
}

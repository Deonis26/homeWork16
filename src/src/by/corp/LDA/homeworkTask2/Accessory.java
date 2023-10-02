package by.corp.LDA.homeworkTask2;

public class Accessory extends Product{
    private String material;
    private String type;

    public Accessory(String material, String type, String name, int prise){
        super(name, prise);
        this.material=material;
        this.type=type;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
 public boolean equals(Object object){
     Accessory accessory;
     if (object instanceof Accessory) {
         accessory = (Accessory) object;
     } else {
         return false;
     }
     if (material.equals(accessory.getMaterial()) && type.equals(accessory.getType())) {
         return true;
     } else {
         return false;
     }
 }
    @Override
    public String toString() {
        return "Accessory{" +
                "material='" + material + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return material.hashCode()+type.hashCode();
    }
}

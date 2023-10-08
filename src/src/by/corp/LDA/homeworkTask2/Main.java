package by.corp.LDA.homeworkTask2;

public class Main {
    public static void main(String[] args) {
        Flower rose = new Flower("Роза красная", (byte) 5, (byte) 1, "Красный", "Роза", 4);
        Flower lily = new Flower("Лилия белая", (byte) 3, (byte) 1, "Белый", "Лилия", 2);

        Accessory toy = new Accessory("Дерево",  "Украшение", "Бисер", 4);
        Accessory stand = new Accessory("Пластик", "Игрушка", "Подставка", 3);

        Bouquet bouquet = new Bouquet(5, "Изобилие");
        bouquet.addFlower(rose);
        bouquet.addAccessory(toy);
        bouquet.addAccessory(stand);

        System.out.println(bouquet.getTotalPrice());
        System.out.println(bouquet);
    }
}

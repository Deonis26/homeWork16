package by.corp.LDA.homeworkTask3;

public class Main {
    public static void main(String[] args) {
        Candy candy = new Candy(1888, (byte) 1111, "199", (byte) 17, "19", 111111, "999999", CandyType.CARAMEL);
        System.out.println(candy.toString());
        System.out.println(candy.hashCode());
    }
}

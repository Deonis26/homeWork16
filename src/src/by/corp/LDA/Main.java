package by.corp.LDA;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Артур", "Петров", 11, 111L, (short) 123);
        Student student2 = new Student("Артур", "Петров", 1, 111L, (short) 123);
        boolean a = student1.equals(student2);
        System.out.println(a);
        System.out.println(student2.hashCode());
        String c=student2.toString();
        System.out.println(student1.hashCode());
        System.out.println(c);
    }
}

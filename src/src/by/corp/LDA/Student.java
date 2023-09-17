package by.corp.LDA;

public class Student {

    private String name;
    private String sureName;
    private int age;
    private long id;
    private short academicPerformance;
    public Student() {

    }
    public Student(String name, String sureName, int age, long id, short academicPerformance) {
        this.name = name;
        this.sureName=sureName;
        this.age = age;
        this.id = id;
        this.academicPerformance = academicPerformance;
    }

    public String toString() {
        return "Имя: "+name+", Фамилия: "+ sureName +"Возраст: " + age + ", Номер карты: " + id + "успеваемость: " + academicPerformance + ".";
    }

    @Override
    public int hashCode() {
        return name.hashCode()+sureName.hashCode()+ age*9 + (int) id + (int) academicPerformance;
    }
    public String getName(){
        return name;
    }
    public String getSureName(){
        return sureName;
    }
    public int getAge() {
        return age;
    }

    public void setName(String name){
        this.name=name;
    }
    public void setSureName(String sureName){
        this.sureName = sureName;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public short getAcademicPerformance() {
        return academicPerformance;
    }
    public void setAcademicPerformance(short academicPerformance) {
        this.academicPerformance = academicPerformance;
    }
    public boolean equals(Object object) {
        Student student;
        if (object instanceof Student) {
            student = (Student) object;
        } else {
            return false;
        }
        if (name.equals(student.getName()) && sureName.equals(student.getSureName()) &&
                age == (student.getAge()) && id == (student.getId()) &&
                academicPerformance == (student.getAcademicPerformance())) {
            return true;
        } else {
            return false;
        }
    }
}
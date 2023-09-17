package by.corp.LDA;

public class Student {

    private int age;
    private long id;
    private short academicPerformance;
    public Student() {

    }
    public Student(int age, long id, short academicPerformance) {
        this.age = age;
        this.id = id;
        this.academicPerformance = academicPerformance;
    }

    public String toString() {
        return " Возраст: " + age + ", Номер карты: " + id + "успеваемость: " + academicPerformance + ".";
    }

    @Override
    public int hashCode() {
        return age + (int) id + (int) academicPerformance;
    }

    public int getAge() {
        return age;
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
        if (age == (student.getAge()) && id == (student.getId()) &&
                academicPerformance == (student.getAcademicPerformance())) {
            return true;
        } else {
            return false;
        }
    }
}
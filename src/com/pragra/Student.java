package com.pragra;

public class Student {
    int id;
    String name;
    int grade;

    // the first line in any constructor is either a call to super() or a call to this()
    public Student () {
        super();
        System.out.println("Inside default");
    }

    public Student(int id) {
        // this();
        this.id = id;
        System.out.println("Inside default 1");
    }

    public Student(int id, String name) {
        this(id);
        this.name = name;
        System.out.println("Inside default 2");
    }

    public Student(int id, String name, int grade) {
        this(id, name);
        this.grade = grade;
        System.out.println("Inside default 3");
    }

    public static void main(String[] args) {
        Student st1 = new Student(1, "test", 50);
        System.out.println(st1);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}

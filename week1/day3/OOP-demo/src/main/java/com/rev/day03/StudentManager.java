package com.rev.day03;

public class StudentManager {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getStudentCount());
        s1.setAge(20);
        s1.setName("Kevin");
        s1.setCourse("Java");
        System.out.println(s1);

        Student s2 = new Student("Frank", 30, "Python");
        System.out.println(s2.getStudentCount());
    }
}

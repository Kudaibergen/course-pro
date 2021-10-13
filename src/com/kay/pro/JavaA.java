package com.kay.pro;

public class JavaA {
    public static final int A = 1;
    public int B;

    public static void main(String[] args) {
        JavaPerson p1 = new JavaPerson();
        p1.name = "Kolya";
        JavaPerson p2 = new JavaPerson();
        p2.name = "Nikita";
        JavaPerson p3 = new JavaPerson();
        p3.name = "Sasha";

        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p3.name);
    }

    public static void xxx2() {

    }

    public void xxx() {
        JavaPerson ja = new JavaPerson();
        ja.hashCode();
        //----
    }
}

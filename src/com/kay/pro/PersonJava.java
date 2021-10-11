package com.kay.pro;

class PersonJava {
    private String name;
    private String secondName;
    private int age;

    PersonJava(String name) {
        this.name = name;
    }

    PersonJava(String name, String secondName, int age) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    void print() {
        System.out.println("name: "+ name +
                "\nsecondName= " + secondName +
                "\nage= " + age);
    }
}

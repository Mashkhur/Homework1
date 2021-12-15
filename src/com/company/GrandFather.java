package com.company;

public class GrandFather {
    private int age;
    private String name;
    private Profession profession;
    private Married marredEnum;

    public GrandFather(int age, String name, Profession profession, Married married) {
        this.age = age;
        this.name = name;
        this.profession = profession;
        this.marredEnum = married;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public Profession getProfession() {
        return profession;
    }

    public Married getMarred() {
        return marredEnum;
    }

    public String getInfo(){
        return "Age:" + age + "\nName:" + name +"\nProfession:"+ profession.getProfession() +"\nMarried:" + marredEnum;
    }
}
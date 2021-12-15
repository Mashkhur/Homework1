package com.company;

public class Son extends Father{

    public Son(int age, String name, Profession profession, Married married) {
        super(age, name, profession, married);
    }

    @Override
    public String getInfo() {
        return "son name"+getName();
    }
}

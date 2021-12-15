package com.company;

public class Main {

    public static void main(String[] args) {

        Father jhon = new Father(45,"Jhon",new Profession("Teacher"),Married.MARRIED);
        Son bon =  new Son(19,"Bon",new Profession("Student"),Married.HAVE_GIlRLFRIEND);
        Son gon = new Son(16,"Gon", new Profession("Sudent"),Married.NO_MARRIED);

        System.out.println(jhon.getInfo());
        jhon.drinkAlcohol("Vodka",5);

        System.out.println("------------------");

        System.out.println(bon.getInfo());
        bon.drinkAlcohol("Whiskey");

        System.out.println("------------------");

        System.out.println(gon.getInfo());
        gon.drinkAlcohol();
    }
}

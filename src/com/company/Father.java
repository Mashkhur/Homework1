package com.company;

public class Father extends GrandFather{
    public Father(int age, String name, Profession profession, Married married){
        super(age,name,profession,married);
    }

    public void drinkAlcohol(String alcohol, int shors){
        int ml = 50 * shors;
        System.out.println(getName() + " drinks" + alcohol + " " + ml + "ml");
    }

    public void drinkAlcohol(String alcohol){
        System.out.println(getName() + " drinks" + alcohol);
    }

    public final void drinkAlcohol(){
        System.out.println(getName() + " Drink water" );
    }
}

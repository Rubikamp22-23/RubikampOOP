package org.example;

public class Main {
    public static void main(String[] args) {
//        System.out.println("Print " + add(1, 4));
//        System.out.println("Print " + add(1.5f, 4.5f));
//        System.out.println("Print " + add(1555.8, 4.5));

//        ExampleClass exampleClass = new ExampleClass();
//        exampleClass.showSomething();

//        GrandFather grandFather = new GrandFather();
//        grandFather.showGrandfatherBehavior();
//        grandFather.showGrandfatherBaldness();
//        grandFather.showGrandfatherActivity();
//        grandFather.showGrandfatherCreativity();
//        grandFather.showGrandfatherSkinColor();
//        grandFather.showGrandfatherHeight();
//        grandFather.showGrandfatherNationality();

//        Father father = new Father();
//        father.showGrandfatherActivity();
//        father.showGrandfatherBehavior();
//        father.showGrandfatherBaldness();
//        father.showGrandfatherCreativity();
//        father.showGrandfatherSkinColor();
//        father.showGrandfatherHeight();
//        father.showGrandfatherNationality();

        Son son = new Son();
        son.showGrandfatherActivity();
        son.showGrandfatherNationality();
        son.showGrandfatherHeight();
        son.showGrandfatherCreativity();
        son.showGrandfatherBaldness();
        son.showGrandfatherSkinColor();
        son.showGrandfatherBehavior();
        son.showSonDegree();

    }

    //Overloading
    public static double add(int a, int b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }

    public static double add(double a, double b) {
        return a + b;
    }

}
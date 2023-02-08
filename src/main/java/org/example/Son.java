package org.example;

public class Son extends Father implements Touchable, Readable{

    @Override
    public void showGrandfatherBehavior() {
        System.out.println("Well-Behave");
    }

    @Override
    public void showGrandfatherBaldness() {
        System.out.println("Not Blad");
    }

    public void showSonDegree(){
        System.out.println("Software Engineering Bachloer");
    }

    @Override
    public void read() {

    }

    @Override
    public void touch() {

    }
}

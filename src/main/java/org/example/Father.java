package org.example;

public class Father extends GrandFather{

    @Override
    public void showGrandfatherActivity() {
        System.out.println("lazy");
    }

    @Override
    public void showGrandfatherHeight() {
        System.out.println("Tall");
    }

}

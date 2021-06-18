package org.example;

public class Singleton {

    private static Singleton instance;

    private final String someValue;

    public String getSomeValue() {
        return someValue;
    }

    private Singleton (String someValue) {
        this.someValue=someValue;
    }

    public static Singleton getInstance(String someValue) {
        if (instance == null)
            instance = new Singleton(someValue);

        return instance;
    }

}

class TestSingleton {
    public static void main(String[] args) {
        Singleton first = Singleton.getInstance("test");
        Singleton second = Singleton.getInstance("test");

        System.out.println(first==second);
        System.out.println(first.getSomeValue());
        System.out.println(second.getSomeValue());

    }
}



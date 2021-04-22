package DesignPattern;

public class Singleton {
    private static Singleton instance;
    private static int count = 0;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
            count++;
        }
        return instance;
    }

    public static void threads() {
        System.out.println(count + " Threads/Objekte angelegt");
    }

    public static void reset(){
        instance = null;
        count = 0;
    }

}

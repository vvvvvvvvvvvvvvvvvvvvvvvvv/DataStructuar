package Lamda;

public class Lamda {
    public static void main(String[] args) {
        Runnable runnable = () -> System.out.println("test");
        runnable.run();
    }
}

package tran_java.chapter3;

public class Round {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = ((float)5/9 * (fahrenheit-32)*1000)%10;
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}

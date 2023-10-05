package tran_java.chapter3;

public class Round {
    public static void main(String[] args) {
        int fahrenheit = 100;
        float celcius = (int)((5/9f * (fahrenheit-32))*100+0.5)/100f;
        //float타입의 리터럴인 9f를 사용해야 0이 되지 않아 실수 결과를 얻는다.
        //0.5를 더한다.
        System.out.println("Fahrenheit:"+fahrenheit);
        System.out.println("Celcius:"+celcius);
    }
}

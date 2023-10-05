package tran_java.chapter3;

public class Formatfix {
    public static void main(String[] args) {
       //이항연산은 두 피연산자의 타입을 일치시킨 후 연산을 수행한다는 것,그리고 int보다 작은 타입은 int로 자동변환한다
        byte a = 10;
        byte b = 20;
        byte c = (byte) (a + b);
        char ch = 'A';
        ch = (char) (ch + 2);
        float f = 3 / 2f;
        long l =  3000 * 3000 * 3000L;
        float f2 = 0.1f;
        double d = 0.1;
        boolean result = (float) d == f2;
        System.out.println("c="+c);
        System.out.println("ch="+ch);
        System.out.println("f="+f);
        System.out.println("l="+l);
        System.out.println("result="+result);
    }
}

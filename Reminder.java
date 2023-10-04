package tran_java.chapter3;

public class Reminder {
    public static void main(String[] args) {
        int num = 24;
        System.out.println((int)Math.ceil((double) num/10)*10 % num);
    }
}

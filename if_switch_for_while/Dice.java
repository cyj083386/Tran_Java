package tran_java.chapter4;

public class Dice {
    public static void main(String[] args) {
        for (int i = 0; i < 6 ; i++) {
            for (int j = 0; j < 6; j++) {
                if (i+j == 6){
                    System.out.println(i+ "+" +j + "= 6");
                }
            }
        }
    }
}

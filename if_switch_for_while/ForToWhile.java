package tran_java.chapter4;

public class ForToWhile {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            for (int j = 0; j <= i; j++)
                System.out.print("*");
            System.out.println();
        }
        //동일하게 while로 변경
        int i = 0;
        while (i <= 10){
            int j = 0;
            while (j <= i){
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}

package tran_java.chapter4;

public class Fibonnaci {
    public static void main(String[] args) {
// Fibonnaci 수열의 시작의 첫 두 숫자를 1, 1로 한다.
        int num1 = 1;
        int num2 = 1;
        int num3 = 0; // 세번째 값
        System.out.print(num1+","+num2);
        for (int i = 0 ; i < 8 ; i++ ) {
            num3 = num1+num2;
            System.out.print(","+num3);
            num1 = num2; // 다음 번 계산을 위해 두번째를 첫번째 값으로 옮김
            num2 = num3; //다음 번 계산을 위해 세번째를 두번째 값으로 옮김
        }
    }
}

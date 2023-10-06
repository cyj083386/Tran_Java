package tran_java.chapter4;

public class Palindrome {
    public static void main(String[] args) {
        int number = 12321;
        int tmp = number;
        int result =0; // 변수 number를 거꾸로 변환해서 담을 변수
        while(tmp !=0) {
            result = result*10 + tmp%10;
            // 원래 숫자를 10으로 나눈 나머지는 1의 자리이다.
            // 결과값의 자리수를 10을 곱해 하나 올린다.
            // 이제 1의 자리값을 더해 넣어주면 된다.
            tmp /= 10;
            // tmp에서 사용한 1의 자리는 10으로 나눠 삭제한다.
        }
        if(number == result)
            System.out.println( number + "는 회문수 입니다.");
        else
            System.out.println( number + "는 회문수가 아닙니다.");
    }
}

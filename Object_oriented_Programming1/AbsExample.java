package Tran_Java.Object_oriented_Programming1;

public class AbsExample {
//주어진 값의 절대값을 반환한다
    public static int abs(int value){
        //0보다 큰 양수이면 그대로 반환, 0보다 작은 음수인 경우 -1을 곱해 부호를 없앰(0은 -1 곱해도 무관)
        //3항연산자로 간결한 코드
        return (value > 0)? value: value * -1;
    }


    public static void main(String[] args) {
        int value = 5;
        System.out.println(value+"의 절대값 :"+abs(value));
        value = -10;
        System.out.println(value+"의 절대값 :"+abs(value));
    }
}

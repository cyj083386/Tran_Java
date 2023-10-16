package Tran_Java.Object_oriented_Programming1;

public class GetDistance {
    public static void main(String[] args) {
        System.out.println(getDistance(1,1,2,2));
    }
   // static메서드인 경우에는 메서드 내에서 인스턴스 변수를 사용할수 없다.
    static double getDistance(int x, int y, int x1, int y1){
        return Math.sqrt(Math.pow((x1-x),2) + Math.pow((y1-y),2));
        // pow 메서드를 호출하여 사용하는 것은 비용이 많이 드는 작업이다. 코드가 너무 복잡해지지 않는다면 아래와 같이 두번 곱할것
        // Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1));
    }
}

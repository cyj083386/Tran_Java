package Tran_Java.Object_oriented_Programming1;

public class GetDistance2 {
    public static void main(String[] args) {
        MyPoint p = new MyPoint(1,1);
        // p (2,2) . 와 의 거리를 구한다
        System.out.println(p.getDistance(2,2));
    }
}

class MyPoint {
    int x; // 인스턴스 변수
    int y; // 인스턴스 변수

    MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }
    //static 메서드와 인스턴스 메서드의 차이를 이해하는 것은 매우 중요
    //인스턴스 변수를 사용했으므로 static은 붙일 수 없다.
     public double getDistance(int x1, int y1){
        return  Math.sqrt((x-x1)*(x-x1) + (y-y1)*(y-y1)); //인스턴스 변수 사용
    }
}
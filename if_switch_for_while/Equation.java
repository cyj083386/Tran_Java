package tran_java.chapter4;

public class Equation {
    public static void main(String[] args) {
        //각각의 범위만큼 루프 0<=x<=10, 0<=y<=10
        for(int x=0; x <=10;x++) {
            for(int y=0; y <=10;y++) {
                if(2*x+4*y==10) {
                    System.out.println("x="+x+", y="+y);
                }
            }
        }
    }
}

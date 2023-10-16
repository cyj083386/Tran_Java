package Tran_Java.Object_oriented_Programming1;

public class MethodDef {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "홍길동";
        s.ban = 1;
        s.no = 1;
        s.kor = 100;
        s.eng = 60;
        s.math = 76;
        System.out.println("이름 :"+s.name);
        System.out.println("총점 :"+s.getTotal());
        System.out.println("평균 :"+s.getAverage());
    }
}
class Student {
    int kor;
    int eng;
    int math;

    String name;
    int ban;
    int no;


    public int getTotal(){
        return kor+eng+math;
    }

    public float getAverage(){
        //int간의 연산이라 소수점아래가 버려지지 않도록 float 타입 리터럴 3f로 나눔.
        //반올림을 위해 10으로 나눌때 다시 10f로 나눈다.
        return Math.round(getTotal()/3f*10)/10f ;
    }
}

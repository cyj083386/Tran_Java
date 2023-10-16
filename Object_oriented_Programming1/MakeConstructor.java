package Tran_Java.Object_oriented_Programming1;

public class MakeConstructor {
    public static void main(String[] args) {
        StudentInfo s = new StudentInfo("홍길동",1,1,100,60,76);
        System.out.println(s.info());
    }
}

class StudentInfo{
    int kor;
    int eng;
    int math;

    String name;
    int ban;
    int no;

    public StudentInfo(String name, int ban, int no, int kor, int eng, int math) {
        this.kor = kor;
        this.eng = eng;
        this.math = math;
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
    public int getTotal(){
        return kor+eng+math;
    }

    public float getAverage(){
        return Math.round(getTotal()/3f*10)/10f ;
    }
    public Object info(){
        //+ 문자열 붙이기로 비효율적으로 String 메모리를 재할당 하지 않도록 StringBuilder 사용.
        //Stringbuffer보다 성능이 좋으나 멀티스레드 환경에서위험
        StringBuilder sb = new StringBuilder();
            sb.append(name).append(",")
                    .append(ban).append(",")
                    .append(no).append(",")
                    .append(kor).append(",")
                    .append(eng).append(",")
                    .append(math).append(",")
                    .append(getTotal()).append(",")
                    .append(getAverage());
            return sb;
    }
}
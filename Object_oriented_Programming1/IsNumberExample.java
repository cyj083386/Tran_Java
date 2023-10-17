package Tran_Java.Object_oriented_Programming1;

public class IsNumberExample {
    //주어진 문자열이 모두 숫자로만 이루어져있는지 확인한다
    public static boolean isNumber(String s) {
        //유효성 체크, 넘겨받은 문자열이 null이거나 ""이면 false 반환
        if(s==null || s.equals(""))
            return false;
        for (int i = 0; i < s.length(); i++) {//String은 for each 사용 불가
            char c = s.charAt(i);
            if (c >= 'a' && c <= 'z') {
                return false; //리턴시 여기서 끝남. 더 루프를 돌지 않음
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "123";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
        str = "12o34";
        System.out.println(str+"는 숫자입니까? "+isNumber(str));
    }
}

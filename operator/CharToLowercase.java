package tran_java.chapter3;

public class CharToLowercase {
    public static void main(String[] args) {
        char ch = 'A';
        char lowerCase = (ch>='A' && ch<='Z') ? Character.toLowerCase(ch) : ch;
        System.out.println("ch:"+ch);
        System.out.println("ch to lowerCase:"+lowerCase);
    }

}

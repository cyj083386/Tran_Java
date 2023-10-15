package Tran_Java.Object_oriented_Programming1;

import java.util.Random;

public class MakeClass {
    public static void main(String[] args) {
        SutdaCard card1 = new SutdaCard(3, false);
        SutdaCard card2 = new SutdaCard();
        System.out.println(card1.info());
        System.out.println(card2.info());
    }
}

class SutdaCard {

    int num;
    boolean isKwang;
    public SutdaCard() {
        //기존의 코드를 호출하는 것이 더 좋은 코드이다. 재사용성이 더 높고 나중에 코드를 수정할 때도 유리하다.
        this(1, true);
    }
    public SutdaCard(int num, boolean isKwang) {
        this.num = num;
        this.isKwang = isKwang;
    }

    public String info(){
        char resultK = (isKwang)? 'K' : ' ';
        return ""+num+resultK;
    }
}

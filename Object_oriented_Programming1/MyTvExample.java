package Tran_Java.Object_oriented_Programming1;

public class MyTvExample {
    public static void main(String[] args) {
        MyTv t = new MyTv();

        // channel, volume 인스턴스 변수 대입 후 출력
        t.channel = 100;
        t.volume = 0;
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);

        //channelDown() 으로 --channel, volumeDown()은 volume이 조건 미부합으로 변화 없음
        t.channelDown();
        t.volumeDown();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);

        // channelUp() 호출하여 ++channel 후 조건 부합으로 1로 변경, volumeUp()은 volume이 조건 미부합으로 변화 없음
        t.volume = 100;
        t.channelUp();
        t.volumeUp();
        System.out.println("CH:"+t.channel+", VOL:"+ t.volume);
    }
}

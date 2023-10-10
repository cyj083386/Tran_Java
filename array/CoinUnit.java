class CoinUnit{
	public static void main(String[] args){
		// 큰 금액의 동적을 우선적으로 거슬러 줘야한다
        int[] coinUnit = {500, 100, 50, 10};
        
        int money = 2680;
        System.out.println("money="+money);
        //동전 단위를 내림차순으로 배열에 초기화 해야한다.
        for(int i=0;i<coinUnit.length;i++) {
            System.out.printf("%d원:%d%n",coinUnit[i], money/coinUnit[i]);
            money = money%coinUnit[i];
        }

	}
}

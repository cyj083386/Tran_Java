class CoinUnit{
	public static void main(String[] args){
		// ū �ݾ��� ������ �켱������ �Ž��� ����Ѵ�
        int[] coinUnit = {500, 100, 50, 10};
        
        int money = 2680;
        System.out.println("money="+money);
        //���� ������ ������������ �迭�� �ʱ�ȭ �ؾ��Ѵ�.
        for(int i=0;i<coinUnit.length;i++) {
            System.out.printf("%d��:%d%n",coinUnit[i], money/coinUnit[i]);
            money = money%coinUnit[i];
        }

	}
}

class ArrayCopyExample{
	public static void main(String[] args){
	int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];
       
	// ballArr �迭�� ������ ��Ҹ� ��� ��ġ�� �ٲ۴�
        for(int i=0; i< ballArr.length;i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        // ballArr �迭�� �տ��� 3���� ���� �迭 ball3�� �����Ѵ�
        /*System.arraycopy(src, srcPos, dest, destPos, length)
        ���ʿ��� �ν��Ͻ� ������ �����Ͽ� �޸� �ڿ� ���� ����
            src - ���� �迭
            srcPos - ���� �迭�� ���� ���� ��ġ
            dest - ������ �迭
            destPost - ������ �迭�� ���� ���� ��ġ
            length - ������ ����� ���� */      
        System.arraycopy(ballArr,0,ball3,0,3);
                        
        for(int i=0;i<ball3.length;i++) {
            System.out.print(ball3[i]);
        }

	}
}
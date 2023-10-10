class ArrayCopyExample{
	public static void main(String[] args){
	int[] ballArr = {1,2,3,4,5,6,7,8,9};
        int[] ball3 = new int[3];
       
	// ballArr 배열의 임의의 요소를 골라서 위치를 바꾼다
        for(int i=0; i< ballArr.length;i++) {
            int j = (int)(Math.random() * ballArr.length);
            int tmp = 0;
            tmp = ballArr[i];
            ballArr[i] = ballArr[j];
            ballArr[j] = tmp;
        }
        // ballArr 배열의 앞에서 3개의 수를 배열 ball3로 복사한다
        /*System.arraycopy(src, srcPos, dest, destPos, length)
        불필요한 인스턴스 생성을 방지하여 메모리 자원 낭비를 예방
            src - 원본 배열
            srcPos - 원본 배열의 복사 시작 위치
            dest - 복사할 배열
            destPost - 복사할 배열의 복사 시작 위치
            length - 복사할 요소의 개수 */      
        System.arraycopy(ballArr,0,ball3,0,3);
                        
        for(int i=0;i<ball3.length;i++) {
            System.out.print(ball3[i]);
        }

	}
}
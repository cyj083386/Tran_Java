class ArraySum{
	public static void main(String[] args){
	    int[][] score = {
                        {100, 100, 100}
                        , {20, 20, 20}
                        , {30, 30, 30}
                        , {40, 40, 40}
                        , {50, 50, 50}
                    };
        int[][] result = new int[score.length+1][score[0].length+1];
        
        for(int i=0; i < score.length ;i++) {
            for(int j=0; j < score[i].length;j++) {
                    //기존 값 넣어주기
                    result[i][j] = score[i][j];
                    //1차 배열 마지막줄에 같은 컬럼 값 다 더해서 넣기
                    result[result.length-1][j] += score[i][j];
                    // 2차 배열 마지막 요소에 같은 행값 다 더해서 넣기
                    result[i][result[0].length-1] += score[i][j];
                    // 1차, 2차 마지막요소에 모든 값 다 더해서 넣기
                    result[result.length-1][result[0].length-1] += score[i][j];
            }
        }
        
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.printf("%4d",result[i][j]);
            }
            System.out.println();
        }
	}
}
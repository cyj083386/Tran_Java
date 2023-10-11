package tran_java.array;

public class CountStar {
    public static void main(String[] args) {
        int[] answer = { 1,4,4,3,1,4,4,2,1,3,2 };
        int[] counter = new int[4];
        // 1 == counter[0], 2 == counter[1] 로 설정, 해당하는 숫자가 나오면 카운터 +1
        for(int i=0; i < answer.length;i++) {
            counter[answer[i]-1] += 1;
        }
        //counter 만큼 별 찍기
        for(int i=0; i < counter.length;i++) {
            System.out.printf("%d %s",counter[i] , "*".repeat(counter[i]));
            System.out.println();
        }
    }
}

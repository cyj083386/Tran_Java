package Tran_Java.Object_oriented_Programming1;

public class MaxExample {
    //주어진 형 배열의 값 중에서 제일 큰 값을 반환한다
    public static int max(int[] arr){
        //예외처리, -999999 반환
        if(arr == null || arr.length == 0)
            return -999999;
        //배열의 첫 번째 값으로 최대값을 초기화 한다
        int max = arr[0];
        for (int num: arr) { //배열내 값을 순차비교
            if(max < num) max = num;
        }
        return max;
    }




    public static void main(String[] args) {
        int[] data = {3,2,9,4,7};
        System.out.println(java.util.Arrays.toString(data));
        System.out.println("최대값 :"+max(data));
        System.out.println("최대값 :"+max(null));
        System.out.println("최대값 :"+max(new int[]{})); // 최대값 크기가 0인 배열
    }
}

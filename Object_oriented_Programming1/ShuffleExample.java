package Tran_Java.Object_oriented_Programming1;

public class ShuffleExample {

    public static int[] shuffle(int[] arr){
        //배열로 어떤값이 넘어올지 모르기때문에 유효성 체크필수
        if(arr==null || arr.length==0)
            return arr;

        int temp;
        for (int i = 0; i < arr.length; i++) {
            // 0이상 arr.length 미만 정수 값을 랜덤하게 출력
            int rnd = (int)(Math.random()*(arr.length));
            temp = arr[i];
            arr[i] = arr[rnd];
            arr[rnd] = temp;
        }
        return arr;
    }


    public static void main(String[] args)
    {
        int[] original = {1,2,3,4,5,6,7,8,9};
        System.out.println(java.util.Arrays.toString(original));
        int[] result = shuffle(original);
        //배열의 내용을 출력하는 메소드사용.그냥 배열을 print()에 넣으면 객체주소를 출력
        System.out.println(java.util.Arrays.toString(result));
    }
}

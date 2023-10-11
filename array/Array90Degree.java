package tran_java.array;

public class Array90Degree {
    public static void main(String[] args) {
        char[][] star = {
                {'*','*',' ',' ',' '},
                {'*','*',' ',' ',' '},
                {'*','*','*','*','*'},
                {'*','*','*','*','*'}
        };
        // 기존 star 가로(1차원) 세로(2차원) 길이를 서로 바꾸어 result 길이 설정
        char[][] result = new char[star[0].length][star.length];

        //star 출력
        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {
                System.out.print(star[i][j]);
            }
            System.out.println();
        }

        System.out.println();
        // 가로 세로 바꾸어 값 대입
        for(int i=0; i < star.length;i++) {
            for(int j=0; j < star[i].length;j++) {
                result[j][star.length-1-i] = star[i][j];
            }
        }
        //result 출력
        for(int i=0; i < result.length;i++) {
            for(int j=0; j < result[i].length;j++) {
                System.out.print(result[i][j]);
            }
            System.out.println();
        }
    }
}

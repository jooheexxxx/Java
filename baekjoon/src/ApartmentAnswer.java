// 풀이 참고 후 작성

import java.io.*;

public class ApartmentAnswer {
    public static void main (String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // StringBuilder는 BufferedWriter 보다 출력 속도 빠름 
        StringBuilder sb = new StringBuilder();

        // k층 n호에 사는 사람 수 : arr[k][n] (1 ≤ k, n ≤ 14)
        // 이중 배열  선언
        int arr[][] = new int [15][15];

        // 규칙1) 0층 n호에 사는 사람은 n명 : arr[0][n] = n
        for(int i=1;i<15;i++){
            arr[0][i] = i;
        }  

        // 규칙2) k층 n호에 사람 사람은 arr[k][n-1] + arr[k-1][n] 명
        // arr[k][n] = arr[k][n-1] + arr[k-1][n]
        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                arr[i][j] = arr[i][j-1]+arr[i-1][j];
            }
        }

        // 테스트 데이터 개수
        int t = Integer.parseInt(br.readLine());
        // 테스트 데이터로 정답 도출
        for(int i=0;i<t;i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]).append('\n');
        }

        System.out.println(sb);
    } 
}

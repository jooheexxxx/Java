// 풀이 참고 후 작성

import java.io.*;

public class Main {
    public static void main (String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int arr[][] = new int [15][15];

        for(int i=1;i<15;i++){
            arr[0][i] = i;
        }  

        for(int i=1;i<15;i++){
            for(int j=1;j<15;j++){
                arr[i][j] = arr[i][j-1]+arr[i-1][j];
            }
        }
        
        int t = Integer.parseInt(br.readLine());
        for(int i=0;i<t;i++) {
            int k = Integer.parseInt(br.readLine());
            int n = Integer.parseInt(br.readLine());
            sb.append(arr[k][n]).append('\n');
        }
        System.out.println(sb);
    } 
}

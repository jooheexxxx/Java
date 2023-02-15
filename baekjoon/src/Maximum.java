import java.io.*;
import java.util.*;

public class Maximum {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int [9][9];

        // 배열 채우기
        for(int i=0;i<9;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        //System.out.println(Arrays.deepToString(arr));

        // 최댓값 구하기
        int max = 0;
        int row = 0;
        int col = 0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(max<=arr[i][j]){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        // 정답 출력
        StringBuilder sb = new StringBuilder();
        sb.append(max+"\n"+row+" "+col);
        System.out.println(sb);
    }    
}

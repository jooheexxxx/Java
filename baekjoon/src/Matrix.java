import java.io.*;
import java.util.*;

public class Matrix {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        // 배열 선언
        int a[][] = new int [row][column];
        int b[][] = new int [row][column];
        // 배열 값 입력
        for(int i=0;i<row;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            for(int j=0;j<column;j++){
                a[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        for(int i=0;i<row;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            for(int j=0;j<column;j++){
                b[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        
        //System.out.println(Arrays.deepToString(a)); // deepToString 메서드 : 2차원 배열의 값을 문자열로 출력
        int sum[][] = new int [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        // 행렬 형태로 출력
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sb.append(sum[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }    
}

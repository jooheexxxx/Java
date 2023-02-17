import java.io.*;
import java.util.*;

public class ColoredPaper {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int [101][101]; // int 배열 기본값은 0
        int num = Integer.parseInt(br.readLine());
        // 색종이가 위치한 지점의 배열 값은 1로 변경 (색종이의 왼쪽 아래 모서리 기준으로 배열 값 지정)
        for(int i=0;i<num;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(line.nextToken());
            int y = Integer.parseInt(line.nextToken());
            for(int j=x;j<=x+9;j++){ // ** j<=x+10 으로 하여 오답, x ~ x+9 까지 10개
                for(int k=y;k<=y+9;k++){
                    arr[j][k] = 1;
                }
            }
        }        
        // 배열 값의 총합 구하기
        int sum = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }    
}

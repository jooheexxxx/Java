import java.io.*;
import java.util.StringTokenizer;

public class Cutline {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 첫째 줄 입력 받기
        StringTokenizer first = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(first.nextToken());
        int prize = Integer.parseInt(first.nextToken());
        // 둘째 줄 입력 받기
        StringTokenizer second = new StringTokenizer(br.readLine());
        int arr[] = new int [num];
        for(int i=0;i<num;i++){
            int score = Integer.parseInt(second.nextToken());
            arr[i] = score;
        }
        // 내림차순 변경
        int t;        
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        // 정답 출력
        System.out.println(arr[prize-1]);
    }
}
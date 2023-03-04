import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt  = Integer.parseInt(br.readLine());
        int[][] arr = new int[cnt][2];
        for(int i=0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr,(int arrA[],int arrB[])->{
            if(arrA[1]==arrB[1]){
                return arrA[0] - arrB[0];
            }else{
                return arrA[1] - arrB[1];
            }
        }
        );
        // 정답 출력
        for(int i=0;i<cnt;i++){ // y값 오름차순으로 출력
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.println(sb);        
    }
}
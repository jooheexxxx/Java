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
        Arrays.sort(arr,(int arrA[],int arrB[])->{ // (arrA,arrB)로 써도 됨
            if(arrA[0]==arrB[0]){ // x값이 같은 경우
                return arrA[1] - arrB[1]; // y값 비교
            }else{
                return arrA[0] - arrB[0]; // x값 비교
            }
        }
        );

        // 정답 출력
        for(int i=0;i<cnt;i++){
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.println(sb);        
    }
}
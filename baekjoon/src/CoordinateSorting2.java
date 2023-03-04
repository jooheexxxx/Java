import java.io.*;
import java.util.*;

public class CoordinateSorting2 {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt  = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 100,000
        // 2차원 배열 선언, x는 (index,0) y는 (index,1)
        int[][] arr = new int[cnt][2];
        for(int i=0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = Integer.parseInt(st.nextToken());
            arr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 오름차순 정렬, Arrays.sort() 사용
        // Comparator 객체 (a,b)를 비교 기준으로 하여 객체 배열 arr을 정렬
        Arrays.sort(arr,(int arrA[],int arrB[])->{ // (arrA,arrB)로 써도 됨
            if(arrA[1]==arrB[1]){ // x값이 같은 경우
                return arrA[0] - arrB[0]; // y값 비교
            }else{
                return arrA[1] - arrB[1]; // x값 비교
            }
            // return값이 양수인 경우 a>b이므로 순서 변경, 음수인 경우 a<b이므로 순서 변경 X, 0인 경우 a=b
        }
        );

        // 정답 출력
        for(int i=0;i<cnt;i++){ // x값 오름차순으로 출력
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.println(sb);        
    }
}
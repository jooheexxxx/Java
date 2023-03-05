import java.io.*;
import java.util.*;

public class SortingByAge {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt  = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 100,000
        // 2차원 배열 선언, 나이는 (index,0) 이름은 (index,1)
        String[][] arr = new String[cnt][2];
        for(int i=0;i<cnt;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            arr[i][0] = st.nextToken();
            arr[i][1] = st.nextToken();
        }

        // Comparator 객체 (a,b)를 비교 기준으로 하여 객체 배열 arr을 정렬
        Arrays.sort(arr,(a,b)->{ 
            if(a[0]==b[0]){ // 나이가 같은 경우
                return -1; // 순서 변경 필요없으므로 음수값 return
            }else{
                return Integer.parseInt(a[0]) - Integer.parseInt(b[0]); // 나이 비교
            }
            // return값이 양수인 경우 a>b이므로 순서 변경, 음수인 경우 a<b이므로 순서 변경 X, 0인 경우 a=b
        }
        );

        // 정답 출력
        for(int i=0;i<cnt;i++){ // 나이순 및 가입순으로 출력
            sb.append(arr[i][0]+" "+arr[i][1]+"\n");
        }
        System.out.println(sb);        
    }
}
import java.io.*;
import java.util.*;

public class WordSorting {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt  = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 20,000
        String[] arr = new String[cnt];
        for(int i=0;i<cnt;i++){
            arr[i] = br.readLine();
        }

        // 오름차순 정렬, Arrays.sort() 사용
        // Comparator 객체 (a,b)를 비교 기준으로 하여 객체 배열 arr을 정렬
        Arrays.sort(arr,(a,b)->{
            if(a.length()==b.length()){ // 글자 수가 같은 경우
                return a.compareTo(b); // 문자열 사전순 비교
            }else{
                return a.length() - b.length(); // 글자 수 비교
            }
            // return값이 양수인 경우 a>b이므로 순서 변경, 음수인 경우 a<b이므로 순서 변경 X, 0인 경우 a=b
        }
        );

        // 중복 제거를 위해 배열을 LinkedHashSet으로 변환, LinkedHashSet은 배열 순서를 보장함
        LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList(arr));
        // LinkedHashSet을 다시 배열로 변환
        String[] result = hs.toArray(new String[0]);

        // 정답 출력
        for(int i=0;i<result.length;i++){
            sb.append(result[i]+"\n");
        }
        System.out.println(sb);        
    }
}
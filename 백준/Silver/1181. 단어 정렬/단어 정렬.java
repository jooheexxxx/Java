import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt  = Integer.parseInt(br.readLine());
        String[] arr = new String[cnt];
        for(int i=0;i<cnt;i++){
            arr[i] = br.readLine();
        }
        Arrays.sort(arr,(a,b)->{
            if(a.length()==b.length()){ // 글자 수가 같은 경우
                return a.compareTo(b); // 문자열 사전순 비교
            }else{
                return a.length() - b.length(); // 글자 수 비교
            }
        }
        );
        LinkedHashSet<String> hs = new LinkedHashSet<>(Arrays.asList(arr));
        String[] result = hs.toArray(new String[0]);

        for(int i=0;i<result.length;i++){
            sb.append(result[i]+"\n");
        }
        System.out.println(sb);        
    }
}
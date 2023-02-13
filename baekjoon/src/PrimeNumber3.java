import java.io.*;
import java.util.*;

public class PrimeNumber3 {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        StringBuilder sb = new StringBuilder(); // 시간 효율 증대를 위해 사용
        int m = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
    
        for(int i=m;i<=n;i++){ // 1 ≤ M ≤ N ≤ 1,000,000 
            List<Integer> temp = new ArrayList<>();          

            for(int j=2;j<=n;j++){ 
                if(i%j==0){                  
                    temp.add(j);
                }
                int tSize = temp.size(); // 시간 효율 증대를 위해 if문에서 메서드 호출하지 않고 변수 처리
                if(i==j && tSize==1){ // 소수인 경우
                    sb.append(j+"\n");
                    //System.out.println(j);
                }
            }            
        }
        System.out.println(sb.toString());
    }
}
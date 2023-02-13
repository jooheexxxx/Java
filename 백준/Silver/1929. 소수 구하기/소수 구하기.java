import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int m = Integer.parseInt(st.nextToken()); // 1 ≤ M ≤ N ≤ 1,000,000
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder(); 
        
        boolean[] prime = new boolean[n+1];
        prime[0] = true;
        prime[1] = true;
        
        int sqrt = (int) Math.sqrt(n); // 제곱근 함수
        for(int i=2;i<=sqrt;i++){
            for(int j=i*i;j<=n;j+=i){
                prime[j] = true;
            }
        }
        
        for (int i=m;i<=n;i++) {
            if (!prime[i]) {
                sb.append(i+"\n");
            }
        }
        System.out.print(sb);
    }
}
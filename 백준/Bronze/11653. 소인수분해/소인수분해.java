import java.io.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1 ≤ N ≤ 10,000,000
        int n = Integer.parseInt(br.readLine());

        if(n==1){
            System.out.println(" ");
        }else{
            for(int i=2;i<=n;i++){ // i<=n 이 아닌 i<n으로 해서 오답
                // 소인수분해
                int j = i;
                while(n%j==0){
                    n = n/j;
                    System.out.println(j);
                }
            }
        }
    }
}
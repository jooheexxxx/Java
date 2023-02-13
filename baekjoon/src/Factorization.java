import java.io.*;

public class Factorization {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 1 ≤ N ≤ 10,000,000
        int n = Integer.parseInt(br.readLine());

        if(n==1){
            System.out.println(" ");
        }else{
            for(int i=2;i<n;i++){
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
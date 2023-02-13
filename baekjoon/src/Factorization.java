import java.io.*;

public class Factorization {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder(); // 시간 단축 (다른 풀이)
        // 1 ≤ N ≤ 10,000,000
        int n = Integer.parseInt(br.readLine());

        for(int i=2;i<=n;i++){ // i<=n 이 아닌 i<n으로 해서 오답
            // 소인수분해
            int j = i;
            while(n%j==0){
                n = n/j;
                System.out.println(j);
            }
        }

        /* 
        while문을 사용한 다른 풀이 
        while (n != 1) {
            // i가 n의 약수이면 나누고 출력
            if (n % i == 0) {
                n/= i;
                sb.append(i + "\n");
            } else {
                i++;
            }
        }
        System.out.print(sb);
        */
    }
}
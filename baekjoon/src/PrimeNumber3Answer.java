import java.io.*;
import java.util.*;

public class PrimeNumber3Answer {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        int m = Integer.parseInt(st.nextToken()); // 1 ≤ M ≤ N ≤ 1,000,000
        int n = Integer.parseInt(st.nextToken());
        StringBuilder sb = new StringBuilder(); // 시간 단축을 위해 사용
    
        // 소수 구하기 알고리즘 : https://st-lab.tistory.com/81
        // 에라토스테네스의 체 (Sieve of Eratosthenes) : https://propercoding.tistory.com/182

        // boolean형 배열 선언, 배열의 길이는 n+1
        boolean[] prime = new boolean[n+1];
        // 0과 1은 소수에서 제외되므로, true로 값 지정
        prime[0] = true;
        prime[1] = true;

        //2부터 시작해서 i의 배수들을 배열에서 지워준다
        // √N 이하의 자연수 중 나누어 떨어지는 수 >> 1과 N을 제외한 다른 약수가 존재 >> 소수가 아님
        int sqrt = (int) Math.sqrt(n); // 제곱근 함수
        for(int i=2;i<=sqrt;i++){
            for(int j=i*i;j<=n;j+=i){
                prime[j] = true;
            }
        }
        // 소수 출력
        for (int i=m;i<=n;i++) {
            if (!prime[i]) {
                sb.append(i+"\n");
            }
        }
        System.out.print(sb);
    }
}
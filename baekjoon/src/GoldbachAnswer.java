// 시간 초과

import java.io.*;

public class GoldbachAnswer {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        // 테스트 케이스 입력 받기
        int temp[] = new int [t];
        for(int i=0;i<t;i++){
            int num = Integer.parseInt(br.readLine());
            temp[i] = num;
        }        
        for(int n=0;n<t;n++){
            int num = temp[n];           
            // 소수 판별 : 에라토스테네스의 체
            boolean[] prime = new boolean [num+1];
            prime[0] = true;
            prime[1] = true;
            for(int i=2;i<=Math.sqrt(num);i++){
                for(int j=i*i;j<=num;j+=i){
                    prime[j] = true;
                }
            }
            // 골드바흐 파티션 출력
            int min = 10000;
            for(int i=0;i<=num/2;i++){ // num/2 이후로 같은 숫자가 반복되므로 num/2 까지만 조회
                if(prime[i]==false && prime[num-i]==false){
                    // 두 소수의 차이가 가장 작은 경우 찾기
                    if(min>num-i*2){
                        min = num-i*2;
                    }                    
                }
            }
            System.out.println((num-min)/2+" "+(num+min)/2);
        }        
    }
}
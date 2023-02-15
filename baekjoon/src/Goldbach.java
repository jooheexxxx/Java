// 시간 초과

import java.io.*;

public class Goldbach {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        // 테스트 케이스
        int temp[] = new int [t];
        for(int i=0;i<t;i++){
            int num = Integer.parseInt(br.readLine());
            temp[i] = num;
        }
        
        for(int n=0;n<t;n++){
            int num = temp[n];
            // 이중 배열 선언, arr[x][n-x] = x와 n-x의 차
            int arr[][] = new int [num+1][num+1];
            for(int i=0;i<=num;i++){
                if(i<=num/2){
                    arr[i][num-i] = num-i*2;
                }else{
                    arr[i][num-i] = i*2-num;
                }                
            }            
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
            for(int i=0;i<=num/2;i++){ // arr 배열은 대칭을 이루므로 num/2 까지만 조회하면 됨
                if(prime[i]==false && prime[num-i]==false){
                    //System.out.println(num+" "+arr[i][num-i]);
                    // 두 소수의 차이가 가장 작은 경우 찾기
                    if(min>arr[i][num-i]){
                        min = arr[i][num-i];
                    }                    
                }
            }
            System.out.println((num-min)/2+" "+(num+min)/2);
        }        
    }
}
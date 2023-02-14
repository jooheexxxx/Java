import java.io.*;

public class BertrandAnswer {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            int num = Integer.parseInt(str);

            if(num==0){
                break;
            }else{
                boolean[] prime = new boolean [num*2+1]; // 배열의 크기는 0 ~ num*2
                prime[0] = true;
                prime[1] = true;
                // 에라토스테네스의 체
                int sqrt = (int) Math.sqrt(num*2); // 최대값인 num*2로 안해서 오답
                for(int i=2;i<=sqrt;i++){
                    for(int j=i*i;j<=num*2;j+=i){
                        prime[j] = true;
                    }
                }
                // n 초과 2n 이하인 소수 개수 카운트
                int cnt = 0;
                for(int i=num+1;i<=num*2;i++){
                    if(!prime[i]){
                        cnt += 1;
                    }
                }
                System.out.println(cnt);
            }
        }   
    }
}
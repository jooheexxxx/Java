import java.io.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            String str = br.readLine();
            int num = Integer.parseInt(str);

            if(num==0){
                break;
            }else{

                boolean[] prime = new boolean [num*2+1];
                prime[0] = true;
                prime[1] = true;

                int sqrt = (int) Math.sqrt(num*2);
                for(int i=2;i<=sqrt;i++){
                    for(int j=i*i;j<=num*2;j+=i){
                        prime[j] = true;
                    }
                }
                // 소수 개수 카운트
                int cnt = 0;
                for(int i=num+1;i<=num*2;i++){
                    if(!prime[i]){
                        cnt ++;
                    }
                }
                System.out.println(cnt);
            }
        }   
    }
}
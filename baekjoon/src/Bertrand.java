// 오답

import java.io.*;
import java.util.*;

public class Bertrand {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> arr = new ArrayList<>(); // 테스트 케이스 배열

        while(true){
            String str = br.readLine();
            int num = Integer.parseInt(str);

            if(num!=0){
                arr.add(num);
            }else{
                break;
            }
        }
        //System.out.println(arr);
 
        for(int i=0;i<arr.size();i++){

            int t = arr.get(i);
            boolean[] prime = new boolean [t*2+1];
            prime[0] = true;
            prime[1] = true;

            int sqrt = (int) Math.sqrt(t);
            for(int j=2;j<=sqrt;j++){
                for(int k=j*j;k<=t*2;k+=j){
                    prime[j] = true;
                }
            }

            System.out.println(prime);
            
            //System.out.println("t: "+t);
            int cnt = 0;

            // 소수 개수 카운트                
            for(int n=t+1;n<=t*2;n++){
                if(!prime[n]){
                    System.out.println(n+" "+prime[n]);
                    cnt += 1;
                }
            }

            System.out.println(cnt);

            
        }  
        
    }
}
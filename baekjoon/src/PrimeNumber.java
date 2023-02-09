import java.io.*;
import java.util.*;

public class PrimeNumber {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주어진 숫자 개수
        int cnt = Integer.parseInt(br.readLine());
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);
        
        List<Integer> arr2 = new ArrayList<>();

        for(int i=0;i<cnt;i++){
            int num = Integer.parseInt(st.nextToken());
            List<Integer> arr = new ArrayList<>();          
            for(int j=2;j<=num;j++){
                if(num%j==0){                    
                    //System.out.println(num+" "+j);                    
                    arr.add(j);
                }
                if(num==j && arr.size()==1){
                    arr2.add(num);
                }              
            }            
        }
        System.out.println(arr2.size());
    }
}
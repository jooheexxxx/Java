import java.io.*;
import java.util.*;

public class PrimeNumber2 {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // m,n <= 1000, m <= n
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();

        for(int i=m;i<=n;i++){
            List<Integer> arr = new ArrayList<>();          
            for(int j=2;j<=n;j++){ 
                if(i%j==0){                  
                    arr.add(j);
                }
                if(i==j && arr.size()==1){ // 소수인 경우
                    answer.add(i);
                }              
            }            
        }

        if(answer.size()<1){
            System.out.println("-1");
        }else{            
            // List<Integer>의 합계 : 리스트.stream().mapToInt(Integer::intValue).sum()
            // Cf. 배열 int[]의 합계 : IntStream.of(배열).sum(), Arrays.stream(배열).sum()
            // 소수의 합
            System.out.println(answer.stream().mapToInt(Integer::intValue).sum());
            // 최솟값
            System.out.println(answer.get(0));
        }
    }
}
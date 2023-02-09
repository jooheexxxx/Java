import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int m = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());
        List<Integer> answer = new ArrayList<>();

        for(int i=m;i<=n;i++){
            List<Integer> arr = new ArrayList<>();          
            for(int j=2;j<=n;j++){ 
                if(i%j==0){                  
                    arr.add(j);
                }
                if(i==j && arr.size()==1){ 
                    answer.add(i);
                }              
            }            
        }

        if(answer.size()<1){
            System.out.println("-1");
        }else{
            System.out.println(answer.stream().mapToInt(Integer::intValue).sum());
            System.out.println(answer.get(0));
        }
    }
}
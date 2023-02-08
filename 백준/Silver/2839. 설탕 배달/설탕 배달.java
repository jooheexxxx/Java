import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sugar = Integer.parseInt(br.readLine());
        List<Integer> bag = new ArrayList<>();

        // n = 5a + 3b (3<=n<=5000)
        // arr[a][b] = a + b
        int arr[][] = new int [1001][1001];
        
        for(int i=0;i<=1000;i++){
            for(int j=0;j<=1000;j++){
                arr[i][j] = 5*i + 3*j;
            }
        }
        
        for(int i=0;i<=1000;i++){
            for(int j=0;j<=1000;j++){
                if(sugar == arr[i][j]){
                    bag.add(i+j);       
                }
            }
        }
        
        if(bag.size()==0){
            System.out.println("-1");
        }else{
            int min = bag.get(0);
            for(int i=0;i<bag.size();i++){
                if(min>bag.get(i)){
                    min = bag.get(i);
                }
            }
            System.out.println(min);           
        }
    }
}
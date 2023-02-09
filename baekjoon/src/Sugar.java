import java.io.*;
import java.util.*;

public class Sugar {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // n = 5a + 3b (3<=n<=5000, 0<=a<=1000, 1<=b)
        // arr[a][b] = a + b
        // 이중 배열 선언
        int arr[][] = new int [1001][1001]; // **주의** 0부터 1000까지이므로 배열 크기는 1001
        
        // 이중 배열 생성
        for(int i=0;i<=1000;i++){
            for(int j=0;j<=1000;j++){
                arr[i][j] = 5*i + 3*j;
            }
        }

        int sugar = Integer.parseInt(br.readLine());
        List<Integer> bag = new ArrayList<>();
        
        // arr 배열의 값이 n인 a,b값을 찾아 bag 배열에 담기
        for(int i=0;i<=1000;i++){
            for(int j=0;j<=1000;j++){
                if(sugar == arr[i][j]){
                    bag.add(i+j);       
                }
            }
        }
        
        if(bag.size()==0){ // 5a + 3b 으로 표현 불가능한 수
            System.out.println("-1"); 
        }else{
            int min = bag.get(0);
            for(int i=0;i<bag.size();i++){
                if(min>bag.get(i)){
                    min = bag.get(i); // a+b의 최솟값 찾기
                }
            }
            System.out.println(min);           
        }
    }
}
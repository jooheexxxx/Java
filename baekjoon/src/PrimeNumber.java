import java.io.*;
import java.util.*;

public class PrimeNumber {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 주어진 숫자 개수
        int cnt = Integer.parseInt(br.readLine());
        // 확인할 숫자 입력받아 String으로 저장
        String str = br.readLine();
        StringTokenizer st = new StringTokenizer(str);        
        List<Integer> answer = new ArrayList<>();

        for(int i=0;i<cnt;i++){
            // 확인할 숫자 하나씩 읽기
            int num = Integer.parseInt(st.nextToken());
            // 소수 확인용 배열
            List<Integer> arr = new ArrayList<>();          
            for(int j=2;j<=num;j++){ // 소수는 1과 자기 자신으로만 나눠지는 수이므로, 1보다 큰 수로 나눠지는지 확인
                if(num%j==0){                  
                    arr.add(j);
                }
                if(num==j && arr.size()==1){ // 1보다 큰 수 중 나눌 수 있는 수가 1개인 경우 소수가 됨
                    answer.add(num);
                }              
            }            
        }
        System.out.println(answer.size()); // 소수 개수 출력
    }
}
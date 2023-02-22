import java.io.*;

public class AscendingOrder3 {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 10,000,000

        // Counting Sort 사용, 시간복잡도는 O(n)
        // 입력되는 숫자는 10,000보다 작거나 같은 자연수, 중복 가능 **
        // int 배열 생성하고, 입력되는 숫자를 인덱스로 갖는 배열의 값을 1씩 더함
        int[] arr = new int[10001];        
        for(int i=0;i<cnt;i++){
            arr[Integer.parseInt(br.readLine())] ++;
        }

        // 정답 출력
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                for(int j=0;j<arr[i];j++){ // 중복 숫자 출력
                    sb.append(i).append("\n");    
                }
            }
        }
        System.out.println(sb);        
    }
}
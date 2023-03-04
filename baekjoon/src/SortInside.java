import java.io.*;

public class SortInside {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line  = br.readLine(); // 1 ≤ N ≤ 10,000,000
        String [] str;
        str = line.split("");
        int cnt = str.length;
        // String -> Int 변환
        int [] num = new int[cnt];
        for(int i=0;i<cnt;i++){
            num[i] = Integer.parseInt(str[i]);
        }

        // Counting Sort : int 배열 생성하고, 입력되는 숫자를 인덱스로 갖는 배열의 값을 1씩 더함
        // 각각의 숫자는 0~9 사이, 중복 가능
        int[] arr = new int[10];        
        for(int i=0;i<cnt;i++){
            arr[num[i]] ++;
        }

        // 정답 출력
        for(int i=arr.length-1;i>=0;i--){ // 내림차순으로 출력
            if(arr[i]>0){
                for(int j=0;j<arr[i];j++){ // 중복 숫자 출력
                    sb.append(i);    
                }
            }
        }
        System.out.println(sb);        
    }
}
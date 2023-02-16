import java.io.*;
//import java.util.Arrays;

public class AscendingOrder {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int arr[] = new int [cnt];
        // 주어진 숫자 그대로 배열 생성
        for(int i=0;i<cnt;i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        // 오름차순 변경
        int t;        
        for(int i=0;i<cnt;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        // 정답 출력
        for(int i=0;i<cnt;i++){
            System.out.println(arr[i]);
        }
    }
}
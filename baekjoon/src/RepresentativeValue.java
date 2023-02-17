import java.io.*;
//import java.util.Arrays;

public class RepresentativeValue {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[] = new int [5];
        // 배열 생성
        for(int i=0;i<5;i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        //System.out.println(Arrays.toString(arr));
        // 오름차순 변경
        int t;        
        for(int i=0;i<5;i++){
            for(int j=0;j<i;j++){
                if(arr[i]<arr[j]){
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        //System.out.println(Arrays.toString(arr));
        // 평균값
        int sum = 0;
        for(int i=0;i<5;i++){
            sum += arr[i];
        }
        System.out.println(sum/5);
        // 중앙값
        System.out.println(arr[2]);
    }
}
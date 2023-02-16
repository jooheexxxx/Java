import java.io.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int arr[] = new int [cnt];
        for(int i=0;i<cnt;i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
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
        for(int i=0;i<cnt;i++){
            System.out.println(arr[i]);
        }
    }
}
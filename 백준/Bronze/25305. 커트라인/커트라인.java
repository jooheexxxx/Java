import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer first = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(first.nextToken());
        int prize = Integer.parseInt(first.nextToken());
        StringTokenizer second = new StringTokenizer(br.readLine());
        int arr[] = new int [num];
        for(int i=0;i<num;i++){
            int score = Integer.parseInt(second.nextToken());
            arr[i] = score;
        }
        int t;        
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                if(arr[i]>arr[j]){
                    t = arr[j];
                    arr[j] = arr[i];
                    arr[i] = t;
                }
            }
        }
        System.out.println(arr[prize-1]);
    }
}
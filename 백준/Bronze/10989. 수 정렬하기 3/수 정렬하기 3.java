import java.io.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        
        int[] arr = new int[10001];        
        for(int i=0;i<cnt;i++){
            arr[Integer.parseInt(br.readLine())] ++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                for(int j=0;j<arr[i];j++){
                    sb.append(i).append("\n");    
                }
            }
        }
        System.out.println(sb);        
    }
}
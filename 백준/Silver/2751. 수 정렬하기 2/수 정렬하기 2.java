import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int cnt = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(int i=0;i<cnt;i++){
            int num = Integer.parseInt(br.readLine());
            arr.add(num);
        }
        Collections.sort(arr);
        for(int num : arr){
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
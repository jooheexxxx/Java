import java.io.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String line  = br.readLine();
        String [] str;
        str = line.split("");
        int cnt = str.length;
        int [] num = new int[cnt];
        for(int i=0;i<cnt;i++){
            num[i] = Integer.parseInt(str[i]);
        }
        int[] arr = new int[10];        
        for(int i=0;i<cnt;i++){
            arr[num[i]] ++;
        }
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
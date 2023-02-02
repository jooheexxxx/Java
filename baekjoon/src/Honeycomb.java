import java.io.*;

public class Honeycomb { 
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 규칙 찾기
        // 6*0 + 1 : 1
        // 6*1 + 1 : 2
        // 6*3 + 1 : 3
        // 6*6 + 1 : 4
        // 6*10 + 1 : 5

        int sum = 0;

        for(int j=0;j<20000000;j++){
        
            sum += j;
            if(num <= 6*sum+1){
                System.out.println(j+1);
                break;
            }
        }
    }
}
import java.io.*;

public class Main { 
    public static void main(String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

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
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int [101][101];
        int num = Integer.parseInt(br.readLine());
        for(int i=0;i<num;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(line.nextToken());
            int y = Integer.parseInt(line.nextToken());
            for(int j=x;j<=x+9;j++){
                for(int k=y;k<=y+9;k++){
                    arr[j][k] = 1;
                }
            }
        }
        int sum = 0;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                sum += arr[i][j];
            }
        }
        System.out.println(sum);
    }    
}

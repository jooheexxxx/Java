import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int arr[][] = new int [9][9];
        for(int i=0;i<9;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            for(int j=0;j<9;j++){
                arr[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        int max = 0;
        int row = 0;
        int col = 0;
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(max<=arr[i][j]){
                    max = arr[i][j];
                    row = i+1;
                    col = j+1;
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append(max+"\n"+row+" "+col);
        System.out.println(sb);
    }    
}

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int row = Integer.parseInt(st.nextToken());
        int column = Integer.parseInt(st.nextToken());
        int a[][] = new int [row][column];
        int b[][] = new int [row][column];

        for(int i=0;i<row;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            for(int j=0;j<column;j++){
                a[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        for(int i=0;i<row;i++){
            StringTokenizer line = new StringTokenizer(br.readLine());
            for(int j=0;j<column;j++){
                b[i][j] = Integer.parseInt(line.nextToken());
            }
        }
        int sum[][] = new int [row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sum[i][j] = a[i][j] + b[i][j];
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                sb.append(sum[i][j]+" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }    
}

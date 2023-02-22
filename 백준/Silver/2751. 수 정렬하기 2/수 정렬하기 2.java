import java.io.*;

public class Main {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); 
        int cnt = Integer.parseInt(br.readLine());
        boolean[] arr = new boolean[2000001];
        
		for(int i=0;i<cnt;i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true;
		}
 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]) {
				sb.append((i-1000000)).append('\n');
			}
		}
		System.out.print(sb);
    }
}
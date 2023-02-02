import java.io.*;
import java.util.*;

public class BreakevenPoint {
    public static void main(String args[]) throws IOException {
        
        // BufferedReader : Scanner보다 속도가 빨라 유리함
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        /*
        // 문자열 자르기 : 구분자 이용
        String[] s = br.readLine().split(" ");        
        int a = Integer.parseInt(s[0]);
        int b = Integer.parseInt(s[1]);
        int c = Integer.parseInt(s[2]);
        */

        // 문자열 자르기 : StringTokenizer 이용
        // (참고)
        // https://eonhwa-theme.tistory.com/33
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        // 손익분기점 계산
        int x;
        
        if(c>b){
            x = a/(c-b)+1;
        }else{
            x = -1;
        }             

        // 출력
        System.out.println(x);
    }
    
}

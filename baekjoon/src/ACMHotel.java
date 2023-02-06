import java.io.*;
import java.util.*;

public class ACMHotel {
    public static void main (String args[]) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> arr = new ArrayList<>();
        String line;

        // 테스트 개수 입력 받기
        int num = Integer.parseInt(br.readLine());

        // 테스트 데이터 입력 받기
        for(int i=0;i<num;i++){
            line = br.readLine();
            arr.add(line);
        }
        //System.out.println(arr);

        // 문제 풀이
        int x;
        int y;

        for(int i=0;i<arr.size();i++){
            String[] s = arr.get(i).split(" ");        
            int h = Integer.parseInt(s[0]);
            int w = Integer.parseInt(s[1]);
            int n = Integer.parseInt(s[2]);

            //y = n % h;                
            if(n % h == 0){ // 정수인 경우
                x = n/h;
                y = h;
            }else{
                x = n/h + 1;
                y = n % h;
            }

            if(x<10){ // 방 번호 형식 : YXX
                System.out.println(y+"0"+x);
            }else{ // 방 번호 형식 : YYXX
                System.out.printf("%d%d\n",y,x);
            }
        }
    }
}
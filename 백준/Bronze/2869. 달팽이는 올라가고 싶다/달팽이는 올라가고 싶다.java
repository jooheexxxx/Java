import java.io.*;

public class Main {

    public static void main(String args[]) throws IOException {
                
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 문자열 자르기 : 구분자 이용
        String[] s = br.readLine().split(" ");        
        double a = Integer.parseInt(s[0]);
        double b = Integer.parseInt(s[1]);
        double v = Integer.parseInt(s[2]);

        // 계산식 (낮에 정상에 도달하면 밤에 미끄러지지 않음)
        // v >= a*day - b*(day-1) 
        double day = (v-b)/(a-b); // 데이터 형을 float로 할 경우 예제3에서 오답 도출

        if(day == (int) day){ // 답이 정수인 경우
            System.out.println((int)day);
        }else{
            System.out.println((int)day+1);
        }
    }    
}
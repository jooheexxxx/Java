import java.io.*;

public class Fraction {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        // 규칙 찾기
        // 1/1

        // 1/2
        // 2/1

        // 3/1
        // 2/2
        // 1/3

        // 1/4
        // 2/3
        // 3/2
        // 4/1

        int sum = 0;
        int x;
        int y;

        for(int i=0;i<20000000;i++){        
            sum += i;
            int a = sum - num;
            if(a >= 0){
                if (i % 2 == 1) { //홀수
                    x = a + 1;
                    y = i - a;
                } else { //짝수
                    x = i - a;
                    y = a + 1;
                }
                System.out.println(x+"/"+y);
                break;
            }
        }
    }
}

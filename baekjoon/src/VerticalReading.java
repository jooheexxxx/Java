import java.io.*;

public class VerticalReading {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 배열 선언, String 배열의 기본값은 null
        String arr[][] = new String [5][15];
        // 배열 값 입력
        for(int i=0;i<5;i++){
            String str = br.readLine();
            for(int j=0;j<str.length();j++){
                arr[i][j] = String.valueOf(str.charAt(j)); // char -> String 형변환 필요
            }
        }
        //System.out.println(Arrays.deepToString(arr)); // deepToString 메서드 : 2차원 배열의 값을 문자열로 출력
        
        // 세로읽기 형태로 출력
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<15;i++){
            for(int j=0;j<5;j++){
                if(arr[j][i]!=null){
                    sb.append(arr[j][i]);
                }
            }
        }
        System.out.println(sb);
    }    
}
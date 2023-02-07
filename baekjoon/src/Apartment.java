// 미해결

import java.io.*;
import java.util.*;
import static java.lang.Math.*;

public class Apartment {
    public static void main (String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> arr = new ArrayList<>();
        String line;

        // 테스트 개수 입력 받기
        int num = Integer.parseInt(br.readLine());

        // 테스트 데이터 입력 받기
        for(int i=0;i<num*2;i++){
            line = br.readLine();
            arr.add(line);
        }

        // 테스트 데이터 분할
        int limit = 2;
        for(int i = 0; i < arr.size(); i += limit){
            // 임시 배열 생성
            List<String> temp = new ArrayList<String>(arr.subList(i, min(i + limit, arr.size())));
            //System.out.println(new ArrayList<String>(arr.subList(i, min(i + limit, arr.size()))));
            int k = Integer.parseInt(temp.get(0));
            int n = Integer.parseInt(temp.get(1));
            //System.out.println("k: "+k+", n:"+n);

            // 문제 풀이
            

    }
}

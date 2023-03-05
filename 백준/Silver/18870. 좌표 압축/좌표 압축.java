import java.io.*;
import java.util.*;

public class Main {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num  = Integer.parseInt(br.readLine());
        String line = br.readLine();
        String [] str;
        str = line.split(" ");
        int [] org = new int[num];
        for(int i=0;i<num;i++){
            org[i] = Integer.parseInt(str[i]);
        }
        int [] sort = org.clone();
        Arrays.sort(sort);

        // key-value 형식으로 저장하기 위해 HashMap 사용
        HashMap<Integer, Integer> hm = new HashMap<>();
        int cnt = 0;
        for(int i=0;i<sort.length;i++){
            if(!hm.containsKey(sort[i])) // 중복 처리
                hm.put(sort[i], cnt++); // 오름차순으로 0부터 1씩 더하며 값 할당
        }
        for(int i=0;i<num;i++){
            sb.append(hm.get(org[i])).append(" ");
        }
        System.out.println(sb);        
    }
}
import java.io.*;
import java.util.*;

// BufferedReader + StringBuilder + Collections.sort() 사용

public class AscendingOrder2_Collections {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 시간 단축을 위해 사용
        int cnt = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 1,000,000
        
        ArrayList<Integer> arr = new ArrayList<>(); // 정렬 시 Collections.sort() 사용을 위해 List 자료구조로 선언
        for(int i=0;i<cnt;i++){
            int num = Integer.parseInt(br.readLine());
            arr.add(num);
        }
        // 오름차순 정렬 - 정렬 알고리즘 참고 https://st-lab.tistory.com/106
        // Collections.sort() : Timsort 로 합병 및 삽입정렬 알고리즘을 사용, 시간복잡도 O(n) ~ O(nlogn) 을 보장, List 계열의 자료구조 사용 필요
        Collections.sort(arr);
        // 정답 출력
        for(int num : arr){
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
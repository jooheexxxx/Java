import java.io.*;
import java.util.*;

// BufferedReader + StringBuilder + Arrays.sort() 사용

public class AscendingOrder2_Arrays {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 시간 단축을 위해 사용
        int cnt = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 1,000,000
        
        int arr[] = new int [cnt]; // 일반 primitive 배열 사용
        for(int i=0;i<cnt;i++){
            int num = Integer.parseInt(br.readLine());
            arr[i] = num;
        }
        // 오름차순 정렬 - 정렬 알고리즘 참고 https://st-lab.tistory.com/106
        // Arrays.sort() : dual-pivot Quicksort 알고리즘 사용, 평균 시간복잡도가 O(nlogn) 이고 매우 빠른 알고리즘이지만 최악의 경우 시간복잡도는 O(n2)
        Arrays.sort(arr);
        for(int num : arr){
            sb.append(num).append("\n");
        }
        System.out.println(sb);
    }
}
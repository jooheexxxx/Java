package Practice;
import java.io.*;
import java.util.*;

// BufferedReader + StringBuilder + Counting Sort 사용

public class CountingSort {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 시간 단축을 위해 사용
        int cnt = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 1,000,000

        int[] array = new int[cnt]; // 수열의 원소, 중복 없음
        int[] counting = new int[2000001]; // 수의 범위 : -1000000 ~ 1000000 (절댓값이 1,000,000보다 작거나 같은 정수)
        int[] result = new int[cnt]; // 새로 정렬할 배열

        // 오름차순 정렬 - 정렬 알고리즘 참고 https://st-lab.tistory.com/106
        // Counting Sort : 시간복잡도는 O(n) 으로 매우 빠른 방법
        // https://st-lab.tistory.com/104?category=856997

        /* 
        // 1. array의 값을 index로 하는 counting 배열 값을 1씩 더하기
        for (int i = 0; i < array.length; i++) {
            counting[array[i]]++;
        }

        // 2. counting 배열의 각 값을 누적합으로 변환
        for (int i = 0; i < counting.length; i++) {
            counting[i] += counting[i - 1];
        }

        // 3. result 배열 생성
        // x : 인덱스가 i인 array 배열의 값
        // y : count[x] - 1
        // result[y] 에 x 값 할당
        // 안정적으로 정렬하기 위해 이 과정을 array의 마지막 index 부터 시작해야 함 **
        for (int i = array.length; i >= 0; i--) {
            int v = array[i];
            result[counting[v] - 1] = v;
        }

        // 정답 출력
        for (int num : result) {
            sb.append(num).append("\n");
        }
        System.out.println(sb);
        */

        // 수의 범위 : -1000000~1000000 (절댓값이 1,000,000보다 작거나 같은 정수)
        // 숫자가 중복되지 않으므로 boolean 타입 사용
        boolean[] arr = new boolean[2000001];
        
		for(int i=0;i<cnt;i++) {
			arr[Integer.parseInt(br.readLine()) + 1000000] = true; // 입력 숫자가 -1000000인 경우 인덱스 0으로 표시하기 위해 +1000000
		}
 
		for(int i=0;i<arr.length;i++) {
			if(arr[i]) {
				sb.append((i-1000000)).append('\n'); // 원래 입력 숫자로 되돌려 출력하기 위해 +1000000
			}
		}
		System.out.print(sb);
    }
}
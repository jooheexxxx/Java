import java.io.*;

// BufferedReader + StringBuilder + Counting Sort 사용

public class AscendingOrder2_Counting {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder(); // 시간 단축을 위해 사용
        int cnt = Integer.parseInt(br.readLine()); // 1 ≤ N ≤ 1,000,000

        // 오름차순 정렬 - 정렬 알고리즘 참고 https://st-lab.tistory.com/106
        // Counting Sort : 직접 비교 정렬이 아니기 때문에 시간복잡도는 O(n) 으로 매우 빠른 방법
        // https://st-lab.tistory.com/104?category=856997
        // https://iseunghan.tistory.com/205
        // 배열 생성 후 입력 받은 수에 해당하는 인덱스의 값을 true로 변경하고, 값이 true인 인덱스를 출력

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
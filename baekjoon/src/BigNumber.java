import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class BigNumber {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));       
        StringTokenizer st = new StringTokenizer(br.readLine());

        // BigInteger : Long 보다 더 큰 정수 표현 시 사용하는 클래스, 범위는 무한대
        // Cf. BigDecimal : 내부적으로 수를 십진수로 저장, 오차를 허용하지 않는 정확한 자료형으로 소수점 이하 값까지 정밀한 계산 시 사용
        // 문자열로 생성
        BigInteger a = new BigInteger(st.nextToken());
        BigInteger b = new BigInteger(st.nextToken());
        
        // BigInteger의 사칙 연산은 기호가 아닌 메서드 사용 Ex. add(), substract(), multiply(), divide()
        System.out.println(a.add(b));
    }
}
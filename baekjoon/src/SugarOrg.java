// 미완료 (5와 3 빼기 반복을 통해 풀어보려 했으나 실패)

import java.io.*;

public class SugarOrg {
    public static void main (String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine());
        int a = -1;
        int b = -1;
        int c = -1;

        if(num%5==0){
            a = num/5;
        }
        else if(num%3==0){
            b = num/3;
        }
        else if(num>=5){
            for(int i=1;i<=1000;i++){
                //while (num % 5!=0) {
                num = num - 5;
                if(num<5){
                    //System.out.println(i);
                    for(int j=1;j<=1000;j++){
                        if(num>=3){
                            num = num - 3;
                            //i = i+1;                    
                            if(num<3){
                                if(num>0){                                    
                                    //System.out.println("-1");
                                    c = -1;
                                }else{
                                    //System.out.println(i);
                                    i = i+1;
                                    c = i;
                                }
                                break;
                            }
                            else{
                                //System.out.println(i);
                                i = i+1;
                                c = i;
                            }
                        }else{
                            c = -1;
                        }                    
                    }
                    break;
                }
                }
        }
        else{
            c = -1;
        }
        System.out.println(a+" "+b+" "+c);
    }
        
}

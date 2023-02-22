package Practice;
import java.util.*;
//import static java.lang.Math.*;

public class ArraySlice {
    public static void main (String args[]) throws Exception {
        // 배열 나누기 1
        // List<String> data=Arrays.asList("test1","test2","test3","test4","test5","test6","test7","test8");
        // int limit = 2;

        // for(int i = 0; i < data.size(); i += limit){
        //     System.out.println(new ArrayList<>(data.subList(i, min(i + limit, data.size()))));
        // }

        // 배열 나누기 2
        final int chunk = 4;
        String[] array = {"1", "2", "3", "4", "5", "6"};
        
        // Google Guava 이용
        //List<List<String>> sliceList = Lists.partition(Arrays.asList(array), chunk);

        // copyOfRange 이용
        for (int i = 0; i < array.length; i += chunk) {
            String[] sliceArray = Arrays.copyOfRange(array, i, Math.min(i + chunk, array.length));
            System.out.println("sliceArray = " + Arrays.asList(sliceArray));
 
        }


        // for (i = 0; i < array.length; i += chunk) {
        //     arr.add(array.slice(i, i + chunk));
        // }
    }
}


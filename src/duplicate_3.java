import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @name duplicate_3
 * @description: 数组中重复的数字
 * @author: yxq
 * @create: 2019-05-22 09:17
 **/
public class duplicate_3 {
    public boolean duplicate(int numbers[],int length,List<Integer> list) {
        boolean flag = false;
        if (numbers == null || length == 0 || length == 1) return flag;
        for (int i = 0; i < length; i++) {
           //i与numbers[i]相等
            if(i==numbers[i]) continue;
            //i与numbers[i]不相等
            else{
                int j = numbers[i];
                //j与numbers[i]相等
                if(j==numbers[j]) {
                    list.add(j);
                    flag = true;
                }
                else{
                    numbers[i] = numbers[j];
                    numbers[j]= j;
                }
            }

        }
        return flag;
    }
    public static void main(String args[]){
        duplicate_3 d3 = new duplicate_3();
        int numbers[] = {2,4,2,1,4};
        List<Integer> list = new ArrayList<Integer>();
        boolean flag = d3.duplicate(numbers,numbers.length,list);
        if(flag){
            for (int i = 0; i <list.size() ; i++) {
                System.out.println(list.get(i));
            }
        }
    }

}

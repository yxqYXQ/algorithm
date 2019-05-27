import java.util.Scanner;

/**
 * @name FindArray_4
 * @description: 在二维数组中查找数字
 * @author: yxq
 * @create: 2019-05-22 10:30
 **/
public class FindArray_4 {
    public boolean Find(int target, int [][] array) {
        boolean flag = false;
        if(array ==null) return flag;
        for (int i = array[0].length-1; i >=0; i--) {
            if(target==array[0][i]){
                flag = true;
                break;
            }
            if(target>array[0][i]){
                for(int j =1 ;j< array.length;j++) {
                    if(target==array[j][i]){
                        flag = true;
                        break;
                    }
                    if(target<array[j][i]){
                        break;
                    }
                }
            }
        }
        return flag;
    }
    public static void main(String args[]){
        FindArray_4 f4 = new FindArray_4();
       int[][] array = {{1,2,8,9},{4,7,10,13}};
       boolean flag = f4.Find(7,array);
       System.out.println(flag);
    }
}

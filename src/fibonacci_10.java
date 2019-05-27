/**
 * @name fibonacci_10
 * @description: 斐波那契数列
 * @author: yxq
 * @create: 2019-05-27 10:27
 **/
public class fibonacci_10 {
    public static void main(String args[]){
       fibonacci_10 f10 = new fibonacci_10();
//       long result = f10.Fibonacci(5);
        long result = f10.Fibonacci_new(5);
       System.out.print(result);
    }
    long Fibonacci(int n){
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return Fibonacci(n-1)+Fibonacci(n-2);

    }

    long Fibonacci_new(int n){
        long fi =0l;
        long f_one = 1;
        long f_zero = 0;
        if(n<=0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        for (int i = 2; i<=n; i++) {
            fi = f_one +f_zero;
            f_zero = f_one;
            f_one = fi;
        }

       return fi;

    }
}

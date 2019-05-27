import java.util.Stack;

/**
 * @name Queue_9
 * @description: 用两个栈实现队列
 * @author: yxq
 * @create: 2019-05-27 09:50
 **/
public class Queue_9 {


    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();

    public void push(int node) {
       stack1.push(node);
    }

    public int pop() throws Exception {
        if(stack1.isEmpty()&&stack2.isEmpty()){
            throw new Exception("栈为空！");
        }
        if(stack2.isEmpty()){
            while(!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        int data = stack2.pop();
        return data;
    }

    public static void main(String  args[]) throws Exception {
        Queue_9 q9 = new Queue_9();
        q9.push(1);
        q9.push(2);
        q9.push(3);
        q9.push(4);
        for (int i = 0; i < 4; i++) {
            System.out.println(q9.pop());
        }

    }
}

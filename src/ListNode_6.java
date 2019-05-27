
import java.util.ArrayList;
import java.util.Stack;

/**
 * @name ListNode_6
 * @description: 从头到尾打印链表
 * @author: yxq
 * @create: 2019-05-22 15:24
 **/
public class ListNode_6 {
    public ArrayList<Integer> printListFromTailToHead(ListNode linkNode) {
        ArrayList<Integer> list = new ArrayList<>();
        Stack<ListNode> stack = new Stack<ListNode>();
        if(linkNode == null||linkNode.next==null) return list;
        while (linkNode!=null) {
            stack.push(linkNode);
            linkNode = linkNode.next;
        }
       while(!stack.isEmpty()) {
            list.add(stack.pop().val);
        }
      return list;
    }
    public static void main(String args[]){
        ListNode_6 l6 = new ListNode_6();
        LinkNode list = new LinkNode();
        list.insert(67);
        list.insert(0);
        list.insert(24);
        list.insert(58);
        ArrayList<Integer> list1 = l6.printListFromTailToHead(list.node);


        for (Integer data :list1) {
            System.out.println(data);
        }
    }
}

class ListNode {
    int val;//数据
    ListNode next;//指针

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

class LinkNode {
    ListNode node;

    /**
     * 插入
     *
     * @param data
     */
    public void insert(int data) {
        if (node == null) {
            node = new ListNode(data);
            return;
        }
        ListNode cur = node;
        while (cur.next != null) {
            cur = cur.next;
        }
        cur.next = new ListNode(data);

    }

    /**
     * 遍历
     */
    public void print() {
        ListNode cur = node;
        if (node == null) {
            return;
        }
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }
}

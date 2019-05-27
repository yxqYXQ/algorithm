import sun.reflect.generics.tree.Tree;

/**
 * @name TreeNext_8
 * @description: 二叉树中的下一个节点
 * @author: yxq
 * @create: 2019-05-24 13:23
 **/
public class TreeNext_8 {

    public TreeLinkNode GetNext(TreeLinkNode pNode)
    {
        if(pNode == null) return null;
        if(pNode.right!=null){
            pNode = pNode.left;
            while (pNode!=null) {
                pNode = pNode.left;
            }
            return pNode;
        }
        if (pNode.right==null){
            if(pNode.next.right==pNode) {
                while (pNode.next != null) {
                    pNode = pNode.next;
                }
                return pNode;
            }
            return pNode.next;
    }

        return null;
    }
    public static void main(String args[]){
        TreeNext_8  t8 = new TreeNext_8();
         ListLinkNode.create();
        TreeLinkNode treeLinkNode1 = ListLinkNode.get('c');
        TreeLinkNode treeLinkNode2 = t8.GetNext(treeLinkNode1);
        System.out.print(treeLinkNode2.val);
    }
}
class TreeLinkNode {
    int val;
    TreeLinkNode next;
    TreeLinkNode left;
    TreeLinkNode right;

    public TreeLinkNode(char data) {
        this.val= data;
    }

}
class ListLinkNode{
    static TreeLinkNode treeLinkNode;
    public static TreeLinkNode create() {
        treeLinkNode = new TreeLinkNode('a');
        treeLinkNode.next = null;
        TreeLinkNode treeLinkNode_left = new TreeLinkNode('b');
        treeLinkNode.left = treeLinkNode_left;
        treeLinkNode_left.next = treeLinkNode;

        TreeLinkNode treeLinkNode_left_1 = new TreeLinkNode('d');
        TreeLinkNode treeLinkNode_right_1 = new TreeLinkNode('e');
        treeLinkNode_left.left = treeLinkNode_left_1;
        treeLinkNode_left.right = treeLinkNode_right_1;
        treeLinkNode_right_1.next = treeLinkNode_left;
        treeLinkNode_left_1.next = treeLinkNode_left;

        TreeLinkNode treeLinkNode_left_12 = new TreeLinkNode('h');
        TreeLinkNode treeLinkNode_right_12 = new TreeLinkNode('i');
        treeLinkNode_right_1.left = treeLinkNode_left_12;
        treeLinkNode_right_1.right = treeLinkNode_right_12;
        treeLinkNode_right_12.next = treeLinkNode_right_1;
        treeLinkNode_left_12.next = treeLinkNode_right_1;




        TreeLinkNode treeLinkNode_right = new TreeLinkNode('c');
        treeLinkNode.right = treeLinkNode_right;
        treeLinkNode_right.next = treeLinkNode;
        TreeLinkNode treeLinkNode_left_2 = new TreeLinkNode('f');
        TreeLinkNode treeLinkNode_right_2 = new TreeLinkNode('g');
        treeLinkNode_right.left = treeLinkNode_left_2;
        treeLinkNode_right.right = treeLinkNode_right_2;
        treeLinkNode_right_2.next = treeLinkNode_right;
        treeLinkNode_left_2.next = treeLinkNode_right;
        return treeLinkNode;
    }
    public static TreeLinkNode get(char data){
        if(treeLinkNode.val==data) {
            return treeLinkNode;
        }
        while (treeLinkNode!=null) {
            while (treeLinkNode.left != null) {
                if (treeLinkNode.val == data) {
                    return treeLinkNode;
                }
                treeLinkNode = treeLinkNode.left;
            }
            while (treeLinkNode.right != null) {
                if (treeLinkNode.val == data) {
                    return treeLinkNode;
                }
                treeLinkNode = treeLinkNode.right;
            }
        }
        return null;
    }
}




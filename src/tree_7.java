import java.util.Arrays;

/**
 * @name tree_7
 * @description: 重建二叉树
 * @author: yxq
 * @create: 2019-05-24 09:11
 **/
public class tree_7 {

    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        if(pre ==null || in == null) return null;
        if(pre.length==0||in.length==0) return null;
        if(pre.length!=in.length) return null;
        TreeNode treeNode = new TreeNode(pre[0]);
        for (int i = 0; i < pre.length; i++) {
            if(pre[0]==in[i]){
                treeNode.left = reConstructBinaryTree(
                        Arrays.copyOfRange(pre,1,i+1), Arrays.copyOfRange(in,0,i));
                treeNode.right = reConstructBinaryTree(
                        Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
            }
        }
        return  treeNode;
    }
    public static void main(String args[]){
        tree_7 t7 = new tree_7();
        int [] pre = {1,2,4,7,3,5,6,8};
        int[] in = {4,7,2,1,5,3,8,6};
        TreeNode treeNode = t7.reConstructBinaryTree(pre,in);

    }
}
class TreeNode {
    int root;
    TreeNode left;
    TreeNode right;
    public TreeNode(int root) {
        this.root = root;
    }
}



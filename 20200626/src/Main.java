//判断是否为平衡二叉树
class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;
    public TreeNode(int val) {
        this.val = val;
    }
}

public class Main {
    public boolean isBalance(TreeNode root) {
        // write code here
        if(root == null){
            return true;
        }
        int leftHeight = getTreeHeight(root.left);
        int rightHeight = getTreeHeight(root.right);
        if(Math.abs(leftHeight - rightHeight) > 1){
            return false;
        }
        return isBalance(root.left) && isBalance(root.right);
    }
    public static int getTreeHeight(TreeNode root){
        if(root == null){
            return 0;
        }
        return Math.max(getTreeHeight(root.left), getTreeHeight(root.right)) + 1;
    }
    public static void main(String[] args) {

    }
}



class Node {
    public char val;
    public Node left;//左孩子-》左子树
    public Node right;//右孩子-》右子树
    public Node(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    public Node buildTree() {
        Node A = new Node('A');
        Node B = new Node('B');
        Node C = new Node('C');
        Node D = new Node('D');
        Node E = new Node('E');
        Node F = new Node('F');
        Node G = new Node('G');
        Node H = new Node('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }

    // 前序遍历   递归来实现
    void preOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    void inOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print(root.val+" ");
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(Node root){
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val+" ");
    }

    static int size = 0;
    int getSize1(Node root) {
        if(root == null) {
            return 0;
        }
        size++;
        getSize1(root.left);
        getSize1(root.right);
        return size;
    }

    int getSize2(Node root) {
        if(root == null) {
            return 0;
        }
        return getSize2(root.left) + getSize2(root.right) + 1;
    }

    //遍历思路-求叶子结点个数
    static int leafSize = 0;
    int getLeafSize1(Node root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1(root.right);
        return leafSize;
    }

    int getLeafSize2(Node root){
        if(root == null) {
            return 0;
        }
        if(root.left == null && root.right == null) {
            return 1;
        }
        return getLeafSize2(root.left) + getLeafSize2(root.right);
    }

    int getKLevelSize(Node root,int k) {
        if(root == null) {
            return 0;
        } else if(k == 1) {
            return 1;
        } else {
            return getKLevelSize(root.left,k - 1) + getKLevelSize(root.right,k - 1);
        }
    }

    int getHeight(Node root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }

    Node find(Node root,int val) {
        if(root == null) {
            return null;
        }
        if(root.val == val) {
            return root;
        }
        Node left = find(root.left,val);
        if(left != null) {
            return left;
        }
        Node right = find(root.right,val);
        if(right != null) {
            return right;
        }
        return null;
    }

    boolean isSameTree(Node p,Node q) {
        if((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if(p == null && q == null) {
            return true;
        }
        if(p.val != q.val) {
            return false;
        }
        return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }

    boolean isSubtree(Node s,Node t) {
        if(s == null || t == null) {
            return false;
        }
        if(isSameTree(s,t)) {
            return true;
        }
        if(isSubtree(s.left,t)) {
            return true;
        }
        if(isSubtree(s.right,t)) {
            return true;
        }
        return false;
    }

    boolean isBalance(Node root) {
        if(root == null) {
            return true;
        }
        int left = getHeight(root.left);
        int right = getHeight(root.right);
        return Math.abs(left - right) < 2 &&
                isBalance(root.left) &&
                isBalance(root.right);
    }

    boolean isSymmetric(Node root) {
        if(root == null) {
            return true;
        }
        return isSymmetricChild(root.left,root.right);
    }

    boolean isSymmetricChild(Node leftTree,Node rightTree) {
        if((leftTree != null && rightTree == null) ||
                (leftTree == null && rightTree != null)) {
            return false;
        }
        if((leftTree == null && rightTree == null)) {
            return true;
        }
        return leftTree.val == rightTree.val && isSymmetricChild(leftTree.left,rightTree.right) &&
                isSymmetricChild(leftTree.right,rightTree.left);
    }

}
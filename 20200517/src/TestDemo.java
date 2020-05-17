public class TestDemo {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        Node root = binaryTree.buildTree();
        Node root2 = binaryTree.buildTree();
        binaryTree.preOrderTraversal(root);
        binaryTree.inOrderTraversal(root);
        binaryTree.postOrderTraversal(root);
        System.out.println(binaryTree.getSize1(root));
        System.out.println(binaryTree.getSize2(root));
        System.out.println(binaryTree.getLeafSize1(root));
        System.out.println(binaryTree.getLeafSize2(root));
        System.out.println("第k层的节点数： ");
        System.out.println(binaryTree.getKLevelSize(root, 4));
        System.out.println("二叉树的高度： ");
        System.out.println(binaryTree.getHeight(root));
        System.out.println("查找节点: ");
        System.out.println(binaryTree.find(root, 'E').val);
        System.out.println("判断两棵树是否相同： ");
        System.out.println(binaryTree.isSameTree(root, root2));
    }
}
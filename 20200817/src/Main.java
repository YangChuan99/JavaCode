class TreeNode {
    int val = 0;
    TreeNode left = null;
    TreeNode right = null;

    public TreeNode(int val) {
        this.val = val;

    }

}
public class Main {
    String Serialize(TreeNode root) {
        if(root==null){
            return "#!";
        }
        StringBuilder sb=new StringBuilder();
        Serialize2(root,sb);
        return sb.toString();
    }
    void Serialize2(TreeNode root,StringBuilder sb){//前序遍历
        if(root==null){
            sb.append("#!");
            return;
        }
        sb.append(root.val);
        sb.append("!");
        Serialize2(root.left,sb);
        Serialize2(root.right,sb);
    }


    TreeNode Deserialize(String str) {
        if(str.length()==0)return null;
        String[] strs=str.split("!");
        return Deserialize2(strs);

    }
    int index=-1;

    TreeNode Deserialize2(String[] strs){
        index++;
        if(!strs[index].equals("#")){
            TreeNode root=new TreeNode(0);
            root.val=Integer.parseInt(strs[index]);
            root.left=Deserialize2(strs);
            root.right=Deserialize2(strs);
            return root;
        }
        return null;
    }

}
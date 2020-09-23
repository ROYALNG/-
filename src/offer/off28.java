package offer;

public class off28 {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    boolean isSymmetrical(TreeNode pRoot){
        if (pRoot == null)
            return true;
        return isSymmetrical(pRoot.left,pRoot.right);
    }

    boolean isSymmetrical(TreeNode t1, TreeNode t2){
        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;

        return isSymmetrical(t1.left,t2.right) && isSymmetrical(t1.right,t2.left);
    }
}
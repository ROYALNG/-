package offer;

import java.util.ArrayList;

public class off34 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }

    private ArrayList<ArrayList<Integer>> ret = new ArrayList<>();

    public ArrayList<ArrayList<Integer>> FindPath(TreeNode root,int target){
        backtracking(root,target,new ArrayList<>());
        return ret;
    }

    private void backtracking(TreeNode node, int target, ArrayList<Integer> path) {
        if(node == null)
            return;
        path.add(node.val);
        target -= node.val;
        if(target == 0 && node.left == null && node.right == null){
            ret.add(new ArrayList<>(path));
        }else {
            backtracking(node.left,target,path);
            backtracking(node.right,target,path);
        }
        path.remove(path.size() - 1);
    }


}

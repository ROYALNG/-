package offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class off32_1 {
    public class TreeNode {
        int val = 0;
        TreeNode left = null;
        TreeNode right = null;

        public TreeNode(int val) {
            this.val = val;

        }

    }
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<Integer> ret = new ArrayList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            int cnt = queue.size();
            while (cnt-- > 0){
                TreeNode t = queue.poll();
                if(t==null)
                    continue;
                ret.add(t.val);
                PrintFromTopToBottom(t.left);
                PrintFromTopToBottom(t.right);
            }
        }
        return ret;
    }
}

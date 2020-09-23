package offer;

public class off8 {
    public class TreeLinkNode {

        int val;
        TreeLinkNode left = null;
        TreeLinkNode right = null;
        TreeLinkNode next = null; // 指向父结点的指针

        TreeLinkNode(int val) {
            this.val = val;
        }
    }

    public TreeLinkNode GetNext(TreeLinkNode pNode){
        if(pNode.right != null){
            TreeLinkNode node = pNode.right;
            while (node.left != null){
                node = node.left;
            }
            return node;
        }else{
            while (pNode.next != null){
                TreeLinkNode parent = pNode.next;
                if(parent.left == pNode){
                    return parent;
                }
                pNode = pNode.next;
            }
        }
        return null;
    }
}

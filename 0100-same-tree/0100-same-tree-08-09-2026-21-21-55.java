/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        } else if(p == null || q == null) {
            return false;
        }

        Queue<TreeNode> pq = new LinkedList();
        pq.add(p);
        pq.add(q);

        while (!pq.isEmpty()) {
            TreeNode l = pq.poll();
            TreeNode r = pq.poll();

            if (l.val != r.val) {
                return false;
            }

            if (l.left != null && r.left != null) {
                pq.add(l.left);
                pq.add(r.left);
            } else if ((l.left != null && r.left == null) || (l.left == null && r.left != null)) {
                return false;
            }


            if (l.right != null && r.right != null) {
                pq.add(l.right);
                pq.add(r.right);
            } else if ((l.right != null && r.right == null) || (l.right == null && r.right != null)) {
                return false;
            }

        }
        return true;
    }
}
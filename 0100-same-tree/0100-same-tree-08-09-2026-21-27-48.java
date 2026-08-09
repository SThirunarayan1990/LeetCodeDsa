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
    record Pair(TreeNode first, TreeNode second) {}

    public boolean isSameTree(TreeNode p, TreeNode q) {

        Queue<Pair> queue = new LinkedList<>();

        queue.offer(new Pair(p, q));

        while (!queue.isEmpty()) {

            Pair pair = queue.poll();

            TreeNode l = pair.first();
            TreeNode r = pair.second();

            // Both are null → same
            if (l == null && r == null) {
                continue;
            }

            // One is null → different
            if (l == null || r == null) {
                return false;
            }

            // Values are different
            if (l.val != r.val) {
                return false;
            }

            // Compare left children
            queue.offer(new Pair(l.left, r.left));

            // Compare right children
            queue.offer(new Pair(l.right, r.right));
        }

        return true;
    }
}
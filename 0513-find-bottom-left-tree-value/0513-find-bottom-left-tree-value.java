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
    public int level(TreeNode root)
    {
        Queue<TreeNode> q=new LinkedList<>();
        List<Integer> ar=new ArrayList<>();
        if(root!=null)
        {
            q.add(root);
            while(!q.isEmpty())
            {
                int s=q.size();   
                List<Integer> ar1=new ArrayList<>();
                for(int i=0;i<s;i++)
                {
                    TreeNode t=q.poll();
                    ar1.add(t.val);
                    if(t.left!=null) q.add(t.left);
                    if(t.right!=null) q.add(t.right);
                }
                ar.add(ar1.get(0));
            }
        }
        // System.out.println(ar);
        // Collections.reverse(ar);
        return ar.get(ar.size()-1);

    }
    

    public int findBottomLeftValue(TreeNode root) {
        return level(root);
    }
}
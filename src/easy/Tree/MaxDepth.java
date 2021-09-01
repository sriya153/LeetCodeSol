package easy.Tree;

public class MaxDepth {
   class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode() {}
      TreeNode(int val) { this.val = val; }
      TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
         this.right = right;
      }
   }
	public int maxDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        int lDepth = maxDepth(root.left);
        int rDepth = maxDepth(root.right);
        int maxDepth = Math.max(lDepth, rDepth);
        return maxDepth+1; 
        
    }

}

package easy.Tree;

public class ValidateBST {
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
	 public boolean isValidBST(TreeNode root) {
	        return validate(root, Double.NEGATIVE_INFINITY, Double.POSITIVE_INFINITY);
	        
	    }
	    
    public boolean validate(TreeNode root , double min , double max){
        if(root==null){
            return true;
        }
        if(root.val <=min && root.val >=max){
           return  false; 
        }
        boolean isLeft = validate(root.left , min,root.val);
        boolean isReft = validate(root.right , root.val , max);
        if(!isLeft || !isReft){
           return  false;  
        }
        return true;
    }

}

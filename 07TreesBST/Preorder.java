public class Preorder {

   static class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;

      TreeNode(int val) {
         this.val = val;
      }
   }

   public static TreeNode buildTree(int[] preorder) {
      int[] index = { 0 };
      return buildTree(preorder, index);
   }

   private static TreeNode buildTree(int[] preorder, int[] index) {
      if (index[0] >= preorder.length) {
         return null;
      }

      TreeNode root = new TreeNode(preorder[index[0]]);
      index[0]++;

      root.left = buildTree(preorder, index);
      root.right = buildTree(preorder, index);

      return root;
   }
}

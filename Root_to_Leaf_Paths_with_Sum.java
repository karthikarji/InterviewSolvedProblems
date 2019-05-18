public class Solution {
    int sum=0;
    LinkedList<Integer> stack = new LinkedList<>();
    public ArrayList<ArrayList<Integer>> pathSum(TreeNode node, int n) {
        ArrayList<ArrayList<Integer>> solution = new ArrayList<ArrayList<Integer>>();
        if(node == null) return solution;
        
        ArrayList<Integer> stack = new ArrayList<>();
        stack.add(node.val);
        traverse(solution, stack, node, n - node.val);
        return solution;
    }
    
    public void traverse(ArrayList<ArrayList<Integer>> solution, ArrayList<Integer> stack, TreeNode node, int sum)
    {
        if(node.left==null && node.right==null && sum==0)
        {
            ArrayList<Integer> temp = new ArrayList<Integer>();
            temp.addAll(stack);
            solution.add(temp);
        }
        
        if(node.right!=null)
        {
            stack.add(node.right.val);
            traverse(solution, stack, node.right, sum-node.right.val);
            stack.remove(stack.size()-1);
        }
        
        if(node.left != null)
        {
            stack.add(node.left.val);
            traverse(solution, stack, node.left, sum-node.left.val);
            stack.remove(stack.size()-1);
         }
    }
    
    
}

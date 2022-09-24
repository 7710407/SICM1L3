
class TreeNode {

    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int num) {
        val = num;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        int array[] = {-10, -5, -3, 1, 5, 8, 9};
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0) return null;
        return constructTreeFromArray(nums, 0, nums.length - 1);
    }

    private TreeNode constructTreeFromArray(int[] nums, int left, int right) {
        if(left > right) return null;
        int midpoint = (left + right) / 2;
        TreeNode node = new TreeNode(nums[midpoint]);
        node.left = constructTreeFromArray(nums, left, midpoint - 1);
        node.right = constructTreeFromArray(nums, midpoint + 1, right);

        return node;
    }
}
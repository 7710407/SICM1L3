public class ProductOfArrayExceptSelf {
    /*
     * Given an array nums of n integers where n > 1, return an array output
     * such that output[i] is equal to the product of all the elements of nums except nums[i].
     * Note: Solve it without division and in O(n).
     * Note* : Could you solve it with constant space complexity.
     *
     * Example:
     * Input: [1, 2, 3, 4]
     * Output: [24, 12, 8, 6]
     * */

    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4};
        int result[] = productExceptSelf(array);
        for (int i = 0; i < result.length; ++i) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        int result2[] = productExceptSelf2(array);
        for (int i = 0; i < result2.length; ++i) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();
    }

    static int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] leftProd = new int[size];
        int[] rightProd = new int[size];
        int[] result = new int[size];

        leftProd[0] = 1;
        rightProd[size - 1] = 1;

        for (int i = 1; i < size; ++i) {
            leftProd[i] = nums[i - 1] * leftProd[i - 1];
        }

        for (int i = size - 2; i >= 0; --i) {
            rightProd[i] = nums[i + 1] * rightProd[i + 1];
        }

        for (int i = 0; i < size; ++i) {
            result[i] = leftProd[i] * rightProd[i];
        }

        return result;
    }

    static int[] productExceptSelf2(int[] nums) {
        int size = nums.length;
        int[] result = new int[size];

        result[0] = 1;

        for (int i = 1; i < size; ++i) {
            result[i] = nums[i - 1] * result[i - 1];
        }

        int r = 1;
        for (int i = size - 1; i >= 0; --i) {
            result[i] = result[i] * r;
            r = nums[i] * r;
        }

        return result;
    }

}

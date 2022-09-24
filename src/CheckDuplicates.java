import java.util.*;

public class CheckDuplicates {
    /*
    * Given an array of integers, 1 <= a[i] <= n (n = size of array), some elements appear twice and others appear once.
    * [4, 3, 2, 7, 8, 2, 3, 1]
    * */
    public static void main(String[] args) {
        int arrayIn[] = {4, 3, 2, 7, 8, 2, 3, 1};
        List<Integer> duplicates = findDuplicates(arrayIn);
        for (Integer i : duplicates) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    static List<Integer> findDuplicates(int[] nums) {
        List<Integer> result = new ArrayList<>();

        for(int i=0; i<nums.length; ++i) {
            int index = Math.abs(nums[i]) - 1;
            if(nums[index] < 0)
                result.add(index + 1);
            nums[index] = -nums[index];
        }

        return result;
    }
}

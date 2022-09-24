import java.util.HashSet;
import java.util.Set;

public class PairOfElementsWithGivenSum {
    public static void main(String[] args) {
        int array[] = {-3, 0, 1, 3, 4};
        int k = 5;

        int result[] = twoSum(array, k);
        for (int i = 0; i < result.length; ++i) {
            System.out.print(result[i] + " ");
        }
        System.out.println();

        System.out.println("===============");

        int result2[] = twoSumHashSet(array, k);
        for (int i = 0; i < result2.length; ++i) {
            System.out.print(result2[i] + " ");
        }
        System.out.println();

        System.out.println("===============");

        int result3[] = twoSumBinarySearch(array, k);
        for (int i = 0; i < result3.length; ++i) {
            System.out.print(result3[i] + " ");
        }
        System.out.println();

        System.out.println("===============");

        int result4[] = twoSumBest(array, k);
        for (int i = 0; i < result4.length; ++i) {
            System.out.print(result4[i] + " ");
        }
        System.out.println();
    }

    static int[] twoSum(int[] nums, int k) {
        for(int i = 0; i < nums.length; ++i) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] + nums[j] == k) {
                    return new int[]{nums[i], nums[j]};
                }
            }
        }
        return new int[0];
    }

    static int[] twoSumHashSet(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; ++i) {
            int number = k - nums[i];
            if(set.contains(number)) {
                return new int[]{number, nums[i]};
            } else {
                set.add(nums[i]);
            }
        }
        return new int[0];
    }

    static int[] twoSumBinarySearch(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i = 0; i < nums.length; ++i) {
            int number = k - nums[i];
            int left = i + 1;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if(nums[mid] == number) {
                    return new int[]{nums[i], nums[mid]};
                } else if(number < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return new int[0];
    }

    static int[] twoSumBest(int[] nums, int k) {
        int left = 0;
        int right = nums.length -1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if(sum == k) {
                return new int[]{nums[left], nums[right]};
            } else if(sum < k) {
                ++left;
            } else {
                --right;
            }
        }
        return new int[0];
    }

}

public class BinarySearchIterative {
    public static void main(String[] args) {
        int array[] = {-10, -5, -3, 1, 5, 8, 9};
        System.out.println(binarySearch(array, 1));
    }

    public static boolean binarySearch(int[] array, int x) {
        int left = 0;
        int right = array.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if(array[mid] == x) {
                return true;
            } else if(x < array[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }

        }

        return false;
    }
}

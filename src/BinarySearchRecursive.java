public class BinarySearchRecursive {
    public static void main(String[] args) {
        int array[] = {-10, -5, -3, 1, 5, 8, 9};
        System.out.println(binarySearch(array, 1));
    }

    private static boolean binarySearch(int[] array, int x, int left, int right) {
        if(left > right) return false;

        int mid = (left + right) / 2;
        if(array[mid] == x) {
            return true;
        } else if(array[mid] > x) {
            return binarySearch(array, x, left, mid - 1);
        } else {
            return binarySearch(array, x, mid + 1, right);
        }
    }

    public static boolean binarySearch(int[] array, int x) {
        return binarySearch(array, x, 0, array.length - 1);
    }
}

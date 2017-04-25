public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = { 1,12,23,34,55,61,67,88,89,101 };
        System.out.println(rank(101, arr));
    }

    public static int rank(int val, int[] arr) {
        return rank(val, arr, 0, arr.length-1);
    }

    private static int rank(int val, int[] arr, int lo, int hi) {
        if (lo > hi) return -1;

        int mid = lo + (hi - lo) / 2;

        if (val < arr[mid]) {
            System.out.println("first if " + mid);
            System.out.println("first lo " + lo);
            System.out.println("first hi " + hi);
            return rank(val, arr, lo, mid - 1);
        } else if (val > arr[mid]) {
            System.out.println("second if " + mid);
            System.out.println("second lo " + lo);
            System.out.println("second hi " + hi);
            return rank(val, arr, mid + 1, hi);
        } else {
            return mid;
        }
    }
}
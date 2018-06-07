package structure;

/**
 * @author Administrator
 * @date 2018/6/1  16:25
 */
public class Main2 {

//    public static int find(Comparable[] arr, Comparable target) {
//
//        return find(arr, 0, arr.length, target);
//    }


    public static int find(int[] arr, int target) {

        return find(arr, 0, arr.length, target);
    }

//    private static int find(Comparable[] arr, int l, int r, Comparable target) {
//        if (l > r) {
//            return -1;
//        }
//        int mid = l + (r - l) / 2;
//        if (arr[mid].compareTo(target) == 0) {
//            return mid;
//        } else if (arr[mid].compareTo(target) > 0) {
//            return find(arr, l, mid - 1, target);
//        } else {
//            return find(arr, mid + 1, r, target);
//        }
//    }


    private static int find(int[] nums, int l, int r, int target) {
        if (l > r) {
            return -1;
        }
        int mid = l + (r - l) / 2;
        if (nums[mid] == target) {
            return mid;
        } else if (nums[mid] > target) {
            return find(nums, l, mid - 1, target);
        } else {
            return find(nums, mid + 1, r, target);
        }
    }

    public static boolean  isPerfectSquare(int num) {
        boolean ps = false;
        for (int i = 0; i <= num; i++) {
            if (i * i == num) {
                ps=true;
                break;
            }
        }
        return ps;
    }

    public static void main(String[] args) {
        System.out.println(isPerfectSquare(14));
    }
}

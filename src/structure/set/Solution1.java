package structure.set;

import java.util.ArrayList;
import java.util.TreeSet;

/**
 * @Author lucasma
 * @Date 2018/5/20 上午8:54
 */
class Solution1 {
    public int[] intersection(int[] nums1, int[] nums2) {
        TreeSet set = new TreeSet();
        for (int i = 0; i < nums1.length; i++) {
            set.add(nums1[i]);
        }

        ArrayList<Integer> list = new ArrayList();

        for (int i = 0; i < nums2.length; i++) {
            if (set.contains(nums2[i])) {
                list.add(nums2[i]);
                set.remove(nums2[i]);
            }
        }

        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }

        return res;
    }
}

package leetcode;

/**
 * Topic
 * Description
 *
 * @author zhouh
 * @version 1.0
 * Create by 2022/8/27 17:02
 */
public class 第88合并两个有序数组 {
    public static void main(String[] args) {
        int[] arr1 = new int[] {1};
        int[] arr2 = new int[] {};
        merge(arr1, 1, arr2, 0);
    }
//    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//        int l = m + n - 1;
//        int p1 = m - 1, p2 = n - 1;
//        while (p1 != -1 || p2 != -1) {
//            if (p1 == -1) nums1[l--] = nums2[p2--];
//            else if (p2 == -1) nums1[l--] = nums1[p1--];
//            else if (nums1[p1] < nums2[p2]) nums1[l--] = nums2[p2--];
//            else nums1[l--] = nums1[p1--];
//        }
//    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
         int cur = m + n - 1;
         int p1 = m - 1, p2 = n - 1;
         while (p1 != -1 || p2 != -1) {
             if (p1 == -1) nums1[cur] = nums2[p2--];
             else if (p2 == -1) nums1[cur] = nums1[p1--];
             else if (nums1[p1] > nums2[p2]) nums1[cur] = nums1[p1--];
             else nums1[cur] = nums2[p2--];
             cur--;
         }
    }
}

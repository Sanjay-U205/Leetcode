// LeetCode problem 88
public class MergeSortArray{
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1; // Pointer for nums1
        int j = n - 1; // Pointer for nums2
        int k = m + n - 1; // Pointer for the end of nums1

        // Merge nums2 into nums1 from the back
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
                k--;
            } else {
                nums1[k] = nums2[j];
                j--;
                k--;
            }
            
        }
    }

    public static void main(String[] args) {
        int nums1[] = {1, 2, 3, 0, 0, 0};
        int nums2[] = {2, 5, 6};
        int m = 3;
        int n = 3;

        merge(nums1, m, nums2, n);

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " "); // Changed println to print for better formatting
        }
    }
}

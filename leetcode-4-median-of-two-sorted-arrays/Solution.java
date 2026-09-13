import java.util.ArrayList;
import java.util.Collections;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        ArrayList<Integer> joinedArray = new ArrayList<Integer>();

        for (int i = 0; i < nums1.length; i++) {
            joinedArray.add(nums1[i]);
        };
        for (int i = 0; i < nums2.length; i++) {
            joinedArray.add(nums2[i]);
        };
        Collections.sort(joinedArray);

        int size = joinedArray.size();
        double median;
        double half = size / 2.0;

        if (size % 2 != 0) {
            int floored = (int) Math.floor(half);
            median = joinedArray.get((int) floored);
        } else {
            median = (joinedArray.get((int) half) + joinedArray.get((int) half - 1)) / 2.0;
        }
        ;

        return median;
    }
}

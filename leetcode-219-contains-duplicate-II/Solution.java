import java.util.HashMap;

class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        HashMap<Integer, Integer> elements = new HashMap<Integer, Integer>();

        boolean result = false;
        for (int i = 0; i <= nums.length - 1; i++) {
            if (elements.containsKey(nums[i])) {
                int position = elements.get(nums[i]);
                result = (Math.abs(position - i) <= k) ? true : false;
                System.out.println(result);
                if (result == true) {
                    return result;
                } else {
                    elements.put(nums[i], i);
                }
                ;
            } else {
                elements.put(nums[i], i);
            }
        }
        return result;
    }
}

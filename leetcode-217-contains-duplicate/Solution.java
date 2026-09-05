import java.util.HashSet;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> iteratedNumbers = new HashSet<>();

        for (int i: nums) {
            if( iteratedNumbers.contains(i)) {
                return true;
            } else {
                iteratedNumbers.add(i);
            }

        }
            return false;
    }

}

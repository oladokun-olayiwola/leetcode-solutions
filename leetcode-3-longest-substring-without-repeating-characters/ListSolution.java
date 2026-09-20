import java.util.LinkedList;
import java.util.List;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        List<Character> subString = new LinkedList<Character>();

        int mostLength = 0;
        int currentLength = 0;

        char[] mainStrArr = s.toCharArray();
        for ( int i = 0; i < mainStrArr.length; i++) {
            if ( !subString.contains(mainStrArr[i]) ) {
                subString.add(mainStrArr[i]);
                currentLength += 1;
                if( currentLength > mostLength ) {
                    mostLength = currentLength;
                }
            } else {
                subString.add(mainStrArr[i]);
                int index = subString.indexOf(mainStrArr[i]);
                subString = subString.subList(index + 1, currentLength + 1);
                currentLength = subString.size();
            }
        }
        return mostLength;
    }
}
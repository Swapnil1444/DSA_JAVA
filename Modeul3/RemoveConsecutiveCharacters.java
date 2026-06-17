 class Solution {
    public String solve(String A, int B) {
       
       StringBuilder ans = new StringBuilder();

        int i = 0;

        while (i < A.length()) {

            int j = i;

            // Count consecutive same characters
            while (j < A.length() && A.charAt(i) == A.charAt(j)) {
                j++;
            }

            int count = j - i;

            // Keep only if count != B
            if (count != B) {
                for (int k = 0; k < count; k++) {
                    ans.append(A.charAt(i));
                }
            }

            i = j;
        }

        return ans.toString();
    }
}
public class RemoveConsecutiveCharacters {
    public static void main(String[] args) {
        Solution s=new Solution();
        System.out.println(s.solve("aabbcde", 2));
    }
}

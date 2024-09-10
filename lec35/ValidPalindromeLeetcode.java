package lec35;

public class ValidPalindromeLeetcode {
    class Solution {
        public boolean isPalindrome(String s) {
            int left = 0;
            int right = s.length() - 1;
            s = s.toLowerCase();

            while (left < right) {
                char leftChar = s.charAt(left);
                char rightChar = s.charAt(right);

                if (!isAlphanumeric(leftChar)) {
                    left++;
                } else if (!isAlphanumeric(rightChar)) {
                    right--;
                } else {
                    if (leftChar != rightChar) {
                        return false;
                    }
                    left++;
                    right--;
                }
            }
            return true;
        }

        private boolean isAlphanumeric(char c) {
            return (c >= 'a' && c <= 'z') || (c >= '0' && c <= '9');
        }
    }

}

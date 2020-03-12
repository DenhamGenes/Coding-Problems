class Solution {
    public boolean isPalindrome(int x) {

        if (x < 0 || x % 10 == 0 && x != 0) {
            return false;
        } else if (x < 10) {
            return true;
        }

        int y = x;
        int reverse = 0;
        while (y > 0) {
            int addon = y % 10;
            y = y / 10;
            reverse = reverse * 10 + addon;

        }
        return x == reverse;

    }
}
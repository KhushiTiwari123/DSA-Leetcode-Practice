class Solution {
    public boolean isPalindrome(int X) {
        if(X<0){
            return false;
        }
        int original = X;
        int reverse = 0;
        while (X != 0) {
            int digit = X % 10;
            reverse = reverse*10 + digit;
            X = X / 10;
        }
        return original == reverse;
        
    }
}

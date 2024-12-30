public class Solution {
    public void reverseString(char[] s) {
        reversemethod(s, 0, s.length - 1);
    }
    
    private void reversemethod(char[] s, int left, int right) {
        if (left >= right) {
            return;
        }
        

        char temp = s[left];
        s[left] = s[right];
        s[right] = temp;
        
    
        reverseHelper(s, left + 1, right - 1);
    }
}

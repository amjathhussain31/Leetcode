class Solution {
    public boolean isPalindrome(String str) {
        str = str.toLowerCase();
        int left=0;
        int right=str.length()-1;
        while(left<right){
            char l = str.charAt(left);
            char r = str.charAt(right);
            if(!Character.isLetterOrDigit(l)){
                left++;
            }
            else if(!Character.isLetterOrDigit(r)){
                right--;
            }
            else if(l != r){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
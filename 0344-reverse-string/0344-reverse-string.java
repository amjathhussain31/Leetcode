class Solution {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;
        while(start<end){
            swap(s,start,end);
            start++;
            end--;
        }
    }
    static void swap(char[] s,int i1,int i2){
        char temp= s[i1];
        s[i1]= s[i2];
        s[i2]= temp;
    }
}
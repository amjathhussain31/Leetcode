class Solution {
    public int countHomogenous(String s) {
        int currentRun = 1;
        long answer = 1;
        if(s.isEmpty()){
            return 0;
        }
        for(int i=1;i<s.length();i++){
            if(s.charAt(i)==s.charAt(i-1)){
                currentRun++;
            } else {
                currentRun=1;
            }
            answer += currentRun;
            answer %= 1000000007;
        }
        return (int)answer;
    }
}
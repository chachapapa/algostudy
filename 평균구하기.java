class Solution {
    public double solution(int[] arr) {
        double answer = 0;
        double n = 0;
        
        for(int i = 0; i<arr.length ; i++){
            n += arr[i];
        }
        
        answer = n/arr.length;
        
        return answer;
    }
}

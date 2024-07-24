class Solution {
    public int solution(int n, int k) {
        
        
        int service = n/10; 
        
        int a = 12000 * n;
        int b = 2000 * (k - service);
        
        int answer = a + b;
        
        return answer;
    }
}
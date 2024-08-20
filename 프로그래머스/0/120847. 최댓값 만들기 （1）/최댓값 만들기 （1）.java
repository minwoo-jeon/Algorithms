import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        int answer = 0;
        
        Arrays.sort(numbers);
        int max = numbers[numbers.length-1];
           
        for(int i=0; i <=numbers.length-2; i++){
            int tmp = max * numbers[i];
            if(tmp > answer )
                answer = tmp ;             
        }
        
        return answer;
    }
}
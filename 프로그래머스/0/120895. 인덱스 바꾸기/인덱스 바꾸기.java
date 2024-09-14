class Solution {
    public String solution(String my_string, int num1, int num2) {
        //my_string을 배열로 변환
        char[] trans = my_string.toCharArray();
        
        char[] answer = new char[trans.length];
 
        for (int i=0; i<trans.length; i++){
            answer[i] += trans[i];
        }
        
   
        answer[num1] = trans[num2];
        answer[num2] = trans[num1];
        return new String(answer);
    }
}
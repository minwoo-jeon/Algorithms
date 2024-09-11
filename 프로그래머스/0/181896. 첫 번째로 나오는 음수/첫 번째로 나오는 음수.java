class Solution {
    public int solution(int[] num_list) {
         int result = 0;
         
        for(int i=0; i<num_list.length; i++){
            int n = num_list[i];
            if(n < 0){
                result = i;
                break;
            }else{
                result = - 1;
            }
        }
     return result;        
 }
}
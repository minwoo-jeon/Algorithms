class Solution {
    public int[] solution(int[] num_list) {
        
        int  num = num_list.length;
        int [] array = new int[num];
        for(int i=num_list.length-1, j=0; i>=0 ; i--,j++){
            array[j] = num_list[i];
        }
            return array;
    }
}
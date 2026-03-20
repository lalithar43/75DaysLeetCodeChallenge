class Solution {
    public int removeDuplicates(int[] nums) {
        
        int size, i=0,j=0;
        size=nums.length;
        for(i=1;i<size;i++){
            
            if(nums[i]!=nums[j]){
                j++;
                nums[j]=nums[i];
            }
        }
        return j+1;
    }
}
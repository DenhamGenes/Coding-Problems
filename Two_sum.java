class Solution {
    public int[] twoSum(int[] nums, int target) 
    {
        int[] array;
        array = new int[2];
        for(int i = 0; i <nums.length; i++)
        {
            int number = nums[i];
            int difference = target - number;

            
                int j = i+1;
                while(j!= nums.length)
                {
                    if(nums[j] == difference)
                    {
                        array[0]=i;
                        array[1]=j;
                        j = nums.length-1;
                    }
                    j++;
                }
            
            
            //cant be that number skip
        }
        return array;
        
        
    }
}
import java.util.Arrays;

class TwoSum {

    public static void main(String[] args) {
        
        
        System.out.println(Arrays.toString(twoSum(new int[]{2, 1, 7, 6, 12, 3}, 13)));
    }
    
    public static int[] twoSum(int[] nums, int target) {
        int[] answer;

        int tally = 0;

        while(tally < nums.length){


            for(int i = 0; i < nums.length; ++i)
            {
                if(tally == i)
                    continue;

                else if((nums[tally] + nums[i]) == target)
                {
                    answer = new int[]{nums[tally], nums[i]};
                    return answer;
                }

            }
            ++tally;
        }//end while
        return new int[]{0, 0};
    }//end method
}//end class

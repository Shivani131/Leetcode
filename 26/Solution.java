import java.util.Arrays; 
class Solution {
public int removeDuplicates(int[] nums) {
        int res = 1;  // initialise result as 1
        for(int i = 1; i<nums.length; i++){    // traverse through 2nd index of array
		
		// check if previous element of array is equal to present element of array or not
            if(nums[i] != nums[res - 1]) {      
                nums[res] = nums[i];    //set element in result array if previous element not equal
                res ++;    //increment result for every different element stored in array
            }
        }
        return res;  // return the resulted array
    }
};
/*
 * (This is a slightly harder version of the fix34 problem.) Return an array
 * that contains exactly the same numbers as the given array, but rearranged
 * so that every 4 is immediately followed by a 5. Do not move the 4's, but
 * every other number may move. The array contains the same number of 4's
 * and 5's, and every 4 has a number after it that is not a 4. In this
 * version, 5's may appear anywhere in the original array.
 */

public int[] fix45(int[] nums) {
  // Go over the array, looking for a 5 first
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 5 && i == 0 || nums[i] == 5 && nums[i - 1] != 4){
      int five = i;
      
      // Look for a 4 that does not have a 5 right after it
      for(int j = 0; j < nums.length; j++){
        if(nums[j] == 4 && nums[j + 1] != 5){
          int temp = nums[j + 1]; // Set a temp value to the number after 4
          nums[j + 1] = 5;
          nums[five] = temp; // Move the temp value to where the 5 was
          break; // Break out of this for loop
        }
      }
    }
  }
  
  // Return the modified array
  return nums;
}

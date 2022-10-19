/*
 * Return the sum of the numbers in the array, except ignore sections of numbers
 * starting with a 6 and extending to the next 7 (every 6 will be followed by
 * at least one 7). Return 0 for no numbers.
 */

public int sum67(int[] nums) {
  // Initialize the sum
  // Section is true when we are between a 6 and 7
  int sum = 0;
  boolean section = false;
  
  // Go over the array adding elements not in the 6 -> 7 section to sum
  int i = 0;
  while(i < nums.length){
    if(nums[i] == 6)
      section = true;
    if(!section)
      sum += nums[i];
    if(nums[i] == 7 && section)
      section = false;
    i++;
  }
  
  // Return the sum
  return sum;
}

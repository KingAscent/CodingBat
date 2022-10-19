/*
 * Return the sum of the numbers in the array, returning 0 for an empty array.
 * Except the number 13 is very unlucky, so it does not count and numbers that
 * come immediately after a 13 also do not count.
 */

public int sum13(int[] nums) {
  // Initialize the sum
  int sum = 0;
  
  // Go over the array, adding to the sum any elements that are not 13 or
  // are immediately after a 13
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 13){
      i++;
    }else{
      sum += nums[i];
    }
  }
  
  // Return the sum
  return sum;
}

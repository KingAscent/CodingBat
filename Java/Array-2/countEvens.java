/*
 * Return the number of even ints in the given array. Note: the % "mod"
 * operator computes the remainder, e.g. 5 % 2 is 1.
 */

public int countEvens(int[] nums) {
  // Initialize the count of even numbers
  int evens = 0;
  
  // Go through the array checking if each element is even
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 2 == 0)
      evens++;
  }
  
  // Return the evens
  return evens;
}

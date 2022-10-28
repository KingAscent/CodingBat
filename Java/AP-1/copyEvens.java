/*
 * Given an array of positive ints, return a new array of length "count"
 * containing the first even numbers from the original array. The original
 * array will contain at least "count" even numbers.
 */

public int[] copyEvens(int[] nums, int count) {
  // Initialize a new int array
  // Initialzie an index integer to keep track of where evens is in the array
  int[] evens = new int[count];
  int index = 0;
  
  // Go over the nums array searching for count even numbers
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 2 == 0 && index != count){
      evens[index] = nums[i];
      index++;
    }
  }
  
  // Return the new array
  return evens;
}

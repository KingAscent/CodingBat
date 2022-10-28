/*
 * We'll say that a positive int n is "endy" if it is in the range 0..10 or
 * 90..100 (inclusive). Given an array of positive ints, return a new array
 * of length "count" containing the first endy numbers from the original array.
 * Decompose out a separate isEndy(int n) method to test if a number is endy.
 * The original array will contain at least "count" endy numbers.
 */

public int[] copyEndy(int[] nums, int count) {
  // Initialize a new array to keep track of the endy numbers
  // Initialize an index to keep track of where we are in the new array
  int[] evens = new int[count];
  int index = 0;
  
  // Go over the nums array, searching for endy numbers
  for(int i = 0; i < nums.length; i++){
    // Check if the number is endy
    if(isEndy(nums[i]) && index != count){
      evens[index] = nums[i];
      index++;
    }
  }
  
  // Return the new array
  return evens;
}

public boolean isEndy(int n) {
  return (0 <= n && n <= 10) || (90 <= n && n <= 100);
}

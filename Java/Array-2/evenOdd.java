/*
 * Return an array that contains the exact same numbers as the given array,
 * but rearranged so that all the even numbers come before all the odd numbers.
 * Other than that, the numbers can be in any order. You may modify and return
 * the given array, or make a new array.
 */

public int[] evenOdd(int[] nums) {
  // Initialize a new array that is the same size as nums
  // Index to keep track of the evenOdd values currently assigned
  int[] evenOdd = new int[nums.length];
  int index = 0;
  
  // Go over nums, adding all of the even numbers into the array
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 2 == 0){
      evenOdd[index] = nums[i];
      index++;
    }
  }
  
  // Go over nums, adding all of the odd numbers into the array
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 2 != 0){
      evenOdd[index] = nums[i];
      index++;
    }
  }
  
  // Return the new array
  return evenOdd;
}

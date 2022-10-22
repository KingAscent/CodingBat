/*
 * Return a version of the given array where all the 10's have been removed.
 * The remaining elements should shift left towards the start of the array as
 * needed, and the empty spaces a the end of the array should be 0. So
 * {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given
 * array or make a new array.
 */

public int[] withoutTen(int[] nums) {
  // Keep count of how many tens there are
  int count = 0;
  
  // Go over the array, adding in all the elements that are not ten
  // shifting the array towards the left side
  for(int i = 0; i < nums.length; i++){
    if(nums[i] != 10){
      nums[count] = nums[i];
      count++;
    }
  }
  
  // Add in all the zeros at the end of the array
  for(int i = count; i < nums.length; i++){
    nums[i] = 0;
  }
  
  // Return the modified array
  return nums;
}

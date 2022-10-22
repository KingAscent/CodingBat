/*
 * Return an array that contains exactly the same numbers as the given array,
 * but rearranged so that every 3 is immediately followed by a 4. Do not move
 * the 3's, but every other number may move. The array contains the same number
 * of 3's and 4's, every 3 has a number after it that is not a 3, and a 3
 * appears in the array before any 4.
 */

public int[] fix34(int[] nums) {
  // Go over the array, looking for 3 to be followed by 4
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 3){
      // If a 3 is found, assign the next value to a temp variable
      // Then assign 4 to the next element and continue over the array
      int temp = nums[i + 1];
      nums[i + 1] = 4;
      for(int j = i + 2; j < nums.length; j++){
        if(nums[j] == 4){
          nums[j] = temp;
        }
      }
    }
  }
  
  // Return the modified array
  return nums;
}

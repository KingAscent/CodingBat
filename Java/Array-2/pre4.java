/*
 * Given a non-empty array of ints, return a new array containing the elements
 * from the original array that come before the first 4 in the original array.
 * The original array will contain at least one 4. Note that it is valid in
 * java to create an array of length 0.
 */

public int[] pre4(int[] nums) {
  // Size of the new array
  // Boolean value is false until a 4 is found
  int size = 0;
  boolean first4 = false;
  
  // Go over the array, looking for the first 4 to appear in the array
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 4 && !first4){
      size = i;
      first4 = true;
    }
  }
  
  // Create an array of size up until 4
  int[] pre4 = new int[size];
  
  // Go over nums, adding elements into the new array
  for(int i = 0; i < pre4.length; i++){
    pre4[i] = nums[i];
  }
  
  // Return the new array
  return pre4;
}

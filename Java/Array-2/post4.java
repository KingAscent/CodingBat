/*
 * Given a non-empty array of ints, return a new array containing the elements
 * from the original array that come after the last 4 in the original array.
 * The original array will contain at least one 4. Note that it is valid in
 * java to create an array of length 0.
 */

public int[] post4(int[] nums) {
  // Size of the new array
  // Boolean value is false until a 4 is found
  int size = 0;
  boolean last4 = false;
  
  /// Go over the array, looking for the last 4 to appear in the array
  for(int i = nums.length - 1; 0 < i; i--){
    if(nums[i] == 4 && !last4){
      size = i;
      last4 = true;
    }
  }
  
  // Create an array of size up after 4
  int[] post4 = new int[nums.length - size - 1];
  
  // Go over nums, adding eleements into the new array
  for(int i = size; i < nums.length - 1; i++){
    post4[i - size] = nums[i + 1];
  }
  
  // return the new array
  return post4;
  
}

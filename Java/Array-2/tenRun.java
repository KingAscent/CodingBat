/*
 * For each multiple of 10 in the given array, change all the values
 * following it to be that multiple of 10, until encountering another
 * multiple of 10. So {2, 10, 3, 4, 20, 5} yields {2, 10, 10, 10, 20, 20}.
 */

public int[] tenRun(int[] nums) {
  // Initialize the multiple of 10 everything will be changed to
  // Once a multiple is found, change tenFound to true to change all
  // following values to the current multiple of 10
  int multiple = 0;
  boolean tenFound = false;
  
  // Go over the array, looking for a multiple of 10, changing elements
  // that follow it to the multiple of 10 until a new multiple appears
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 10 == 0){
      tenFound = true;
      multiple = nums[i];
    }
    
    // If a multiple of 10 is found, make every value following it the multiple
    if(tenFound)
      nums[i] = multiple;
  }
  
  // Return the modified array
  return nums;
}

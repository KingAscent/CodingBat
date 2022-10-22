/*
 * Given an array of ints, return true if there is a 1 in the array with a
 * 2 somewhere later in the array.
 */

public boolean has12(int[] nums) {
  // Go over the array, searching for the first instance of 1
  // Once a 1 is found, search for a 2
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 1){
      // Since 1 is found, start from the back of the array looking for a 2
      for(int j = nums.length - 1; i < j; j--){
        if(nums[j] == 2)
          return true;
      }
    }
  }
  
  // There is no 1 followed by a 2 somewhere in the array
  return false;
}

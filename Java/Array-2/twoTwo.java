/*
 * Given an array of ints, return true if every 2 that appears in the array
 * is next to another 2.
 */

public boolean twoTwo(int[] nums) {
  // Go over the array, if there is a 2 and it is not next to another 2,
  // return false
  for(int i = 0; i < nums.length; i++){
    // If a 2 is found, check if a value exists after this 2 and is a 2 as well
    if(nums[i] == 2){
      // If another 2 is found, increment i by 2, otherwise return false
      if(i < nums.length - 1 && nums[i + 1] == 2)
        i += 2;
      else
        return false;
    }
  }
  
  // Every 2 that appears in the array was next to another 2
  return true;
}

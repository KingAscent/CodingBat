/*
 * Given an array of ints, return true if the value 3 appears in the array
 * exactly 3 times, and no 3's are next to each other.
 */

public boolean haveThree(int[] nums) {
  // To keep count of how many 3's appear
  int threes = 0;
  
  // Go over the array looking for 3 3's separate from one another
  // If any threes appeared in the array next to one another, return false
  for(int i = 0; i < nums.length; i++){
    if(nums[i] == 3){
      threes++;
      // A 3 was found, check if it is followed directly by another 3
      if(i < nums.length - 1 && nums[i + 1] == 3)
        return false;
    }
  }
  
  // Return whether or not only 3 three's appeared in the array
  return threes == 3;
}

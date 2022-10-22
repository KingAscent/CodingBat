/*
 * We'll say that a "mirror" section in an array is a group of contiguous
 * elements such that somewhere in the array, the same group appears in reverse
 * order. For example, the largest mirror section in {1, 2, 3, 8, 9, 3, 2, 1}
 * is length 3 (the {1, 2, 3} part). Return the size of the largest mirror
 * section found in the given array.
 */

public int maxMirror(int[] nums) {
  // Initialize a max value to keep track of the highest length mirror
  int max = 0;
  
  // Use two pointers, one at the start and another at the end of the array
  // Keep track of the mirror's length using the count variable
  for(int i = 0; i < nums.length; i++){
    int count = 0;
    for(int j = nums.length - 1; 0 <= j; j--){
      if(i + count < nums.length && nums[i + count] == nums[j])
        count++;
      else{
        max = Math.max(max, count);
        count = 0;
      }
    }
    max = Math.max(max, count);
  }
  
  // Return the max
  return max;
}

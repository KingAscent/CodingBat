/*
 * Given two arrays, A and B, of non-negative int scores. A "special" score is
 * one which is a multiple of 10, such as 40 or 90. Return the sum of largest
 * special score in A and the largest special score in B. To practice
 * decomposition, write a separate helper method which finds the largest special
 * score in an array. Write your helper method after your scoresSpecial() method
 * in the JavaBat text area.
 */

public int scoresSpecial(int[] a, int[] b) {
  int aSpecial = scoresHelper(a);
  int bSpecial = scoresHelper(b);
  return aSpecial + bSpecial;
}

public int scoresHelper(int[] nums) {
  int largestSpec = 0;
  
  // Check the array for its largest special score
  for(int i = 0; i < nums.length; i++){
    if(nums[i] % 10 == 0 && largestSpec < nums[i])
      largestSpec = nums[i];
  }
  
  // Return the largest special score
  return largestSpec;
}

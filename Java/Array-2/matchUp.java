/*
 * Given arrays nums1 and nums2 of the same length, for every element in nums1,
 * consider the corresponding element in nums2 (at the same index). Return the
 * count of the number of times that the two elements differ by 2 or less, but
 * are not equal.
 */

public int matchUp(int[] nums1, int[] nums2) {
  // Keep count of how many times the two elements differ by 2 or less
  int count = 0;
  
  // Go over the array, checking if the elements differ by 2 or less, but are
  // not equal
  for(int i = 0; i < nums1.length; i++){
    if((nums1[i] != nums2[i]) && (Math.abs(nums1[i] - nums2[i]) <= 2))
      count++;
  }
  
  // Return the count
  return count;
}

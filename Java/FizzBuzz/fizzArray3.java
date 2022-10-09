/*
 * Given start and end numbers, return a new array containing the sequence
 * of integers from start up to but not including end, so start=5 and end=10
 * yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the
 * start number. Note that a length-0 array is valid. (See also: FizzBuzz Code)
 */

public int[] fizzArray3(int start, int end) {
  int length = end - start;
  int[] list = new int[length];
  
  // Add the integers to the new integer array up to, but not including the end
  for(int i = 0; i < length; i++){
    list[i] = end - length + i;
  }
  
  return list;
}

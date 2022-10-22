/*
 * Given n>=0, create an array length n*n with the following pattern,
 * shown here for n=3 : {0, 0, 1,    0, 2, 1,    3, 2, 1} (spaces added to
 * show the 3 groups).
 */

public int[] squareUp(int n) {
  // Filter out arrays of length 0
  if(n == 0)
    return new int[]{};
  
  // Create an array that is of the proper size for the pattern
  int[] group = new int[n * n];
  
  // Go over the new array, adding each element, and skipping over the zeros
  for(int i = n - 1; i < group.length; i += n){
    for(int j = i; i - (i / n) <= j; j--){
      group[j] = i - j + 1;
    }
  }
  
  // Return the new array
  return group;
}

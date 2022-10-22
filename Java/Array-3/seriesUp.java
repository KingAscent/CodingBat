/*
 * Given n>=0, create an array with the pattern {1,    1, 2,    1, 2, 3,   ...
 * 1, 2, 3 .. n} (spaces added to show the grouping). Note that the length of
 * the array will be 1 + 2 + 3 ... + n, which is known to sum to exactly
 * n*(n + 1)/2.
 */

public int[] seriesUp(int n) {
  // Create a new array that will fit the given n
  // Create an index variable to keep track of what index we are on
  int[] group = new int[n * (n + 1) / 2];
  int index = 0;
  
  // Go over the new array, adding in elements to follow the pattern
  for(int i = 1; i <= n; i++){
    for(int j = 0; j < i; j++){
      group[index + j] = j + 1;
    }
    index += i;
  }
  
  // Return the new array
  return group;
}

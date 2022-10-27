/*
 * Given an array of scores, return true if there are scores of 100 next to
 * each other in the array. The array length will be at least 2.
 */

public boolean scores100(int[] scores) {
  // Go over the array looking for if two 100s are next to one another
  // Return true if found
  for(int i = 0; i < scores.length - 1; i++){
    if(scores[i] == 100 && scores[i] == scores[i + 1])
      return true;
  }
  
  // No two 100s were found next to one another, return false
  return false;
}

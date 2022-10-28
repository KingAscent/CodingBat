/*
 * Given an array of scores, return true if each score is equal or greater than
 * the one before. The array will be length 2 or more.
 */

public boolean scoresIncreasing(int[] scores) {
  // Go over the array checking if the case (i + 1 < i) is found, return false
  for(int i = 0; i < scores.length - 1; i++){
    if(scores[i + 1] < scores[i])
      return false;
  }
  
  // No failing case was found, return true
  return true;
}

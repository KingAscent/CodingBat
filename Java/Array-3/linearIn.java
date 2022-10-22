/*
 * Given two arrays of ints sorted in increasing order, outer and inner, return
 * true if all of the numbers in inner appear in outer. The best solution makes
 * only a single "linear" pass of both arrays, taking advantage of the fact that
 * both arrays are already in sorted order.
 */

public boolean linearIn(int[] outer, int[] inner) {
  // Since the list is sorted, we do not need to go to the front all the time
  // when looking at the outer array
  int outerInt = 0;
  
  // Go over the inner array, checking to see if its numbers are in the outer
  for(int i = 0; i < inner.length; i++){
    // Go over the outer array and compare its numbers to inner
    for(outerInt = outerInt; outerInt < outer.length; outerInt++){
      // If inner and outer match, break and check the next inner element
      if(outer[outerInt] == inner[i])
        break;
      // If the outer is larger than the inner, the inner is not present
      if(inner[i] < outer[outerInt])
        return false;
      // If inner does not match outer and outer has reached the end of the
      // array, then the inner is not present
      if(inner[i] != outer[outerInt] && outerInt == outer.length - 1)
        return false;
    }
  }
  
  // Every integer in the inner array was present
  return true;
}

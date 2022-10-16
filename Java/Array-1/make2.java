/*
 * Given 2 int arrays, a and b, return a new array length 2 containing,
 * as much as will fit, the elements from a followed by the elements
 * from b. The arrays may be any length, including 0, but there will
 * be 2 or more elements available between the 2 arrays.
 */

public int[] make2(int[] a, int[] b) {
  // Find out the length of a and return a new array based on elements in a,
  // followed by elements in b
  if(a.length == 0){
    return new int[]{b[0], b[1]};
  }else if(a.length == 1){
    return new int[]{a[0], b[0]};
  }else{
    return new int[]{a[0], a[1]};
  }
}

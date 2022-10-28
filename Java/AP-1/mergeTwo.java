/*
 * Start with two arrays of strings, A and B, each with its elements in
 * alphabetical order and without duplicates. Return a new array containing the
 * first N elements from the two arrays. The result array should be in
 * alphabetical order and without duplicates. A and B will both have a length
 * which is N or more. The best "linear" solution makes a single pass over A
 * and B, taking advantage of the fact that they are in alphabetical order,
 * copying elements directly to the new array.
 */

public String[] mergeTwo(String[] a, String[] b, int n) {
  String[] merged = new String[n];
  int aIndex = 0;
  int bIndex = 0;
  
  // Go over a and b, adding strings into the new array
  for(int i = 0; i < n; i++){
    if(a[aIndex].compareTo(b[bIndex]) < 0){ // a comes before b
      merged[i] = a[aIndex];
      aIndex++;
    }else if(b[bIndex].compareTo(a[aIndex]) < 0){ // b comes before a
      merged[i] = b[bIndex];
      bIndex++;
    }else{ // a and b are equal
      merged[i] = a[aIndex];
      aIndex++;
      bIndex++;
    }
  }
  
  // Return the new array
  return merged;
}

/*
 * Given 2 strings, a and b, return a string of the form short+long+short,
 * with the shorter string on the outside and the longer string on the
 * inside. The strings will not be the same length, but they may be empty
 * (length 0).
 */

public String comboString(String a, String b) {
  String shorter = a;
  String longer = b;
  
  // Check to see if a is truly shorter than b, and if it isn't, assign b
  // to the shorter variable, and a to the longer variable
  if(b.length() < a.length()){
    shorter = b;
    longer = a;
  }
  return shorter + longer + shorter;
}

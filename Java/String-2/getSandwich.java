/*
 * A sandwich is two pieces of bread with something in between.
 * Return the string that is between the first and last appearance of
 * "bread" in the given string, or return the empty string ""
 * if there are not two pieces of bread.
 */

public String getSandwich(String str) {
  // Find the first and last instance of bread
  int start = str.indexOf("bread");
  int end = str.lastIndexOf("bread");
  
  String something = "";
  // Check to see that the first and last instance of bread is not the same
  // and if they are not, set the "something" string to be that substring
  if(start != end)
    something = str.substring(start + 5, end);

  return something;
}

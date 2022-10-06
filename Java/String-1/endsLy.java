/*
 * Given a string, return true if it ends in "ly".
 */

public boolean endsLy(String str) {
  // Filter out strings that are less than length 2
  if(str.length() < 2)
    return false;
  return str.substring(str.length() -2).equals("ly");
}

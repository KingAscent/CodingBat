/*
 * Given a string, return the sum of the digits 0-9 that appear in the string,
 * ignoring all other characters. Return 0 if there are no digits in the string.
 * (Note: Character.isDigit(char) tests if a char is one of the
 * chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
 */

public int sumDigits(String str) {
  // Keep track of the sum of the digits in the string
  int sum = 0;
  
  // Go over the string, adding any digits in the string to sum
  for(int i = 0; i < str.length(); i++){
    if(Character.isDigit(str.charAt(i)))
      sum += Integer.parseInt(str.substring(i, i + 1));
  }
  
  // Return the sum
  return sum;
}

/*
 * Given a string, return the sum of the numbers appearing in the string,
 * ignoring all other characters. A number is a series of 1 or more digit
 * chars in a row. (Note: Character.isDigit(char) tests if a char is one
 * of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a
 * string to an int.)
 */

public int sumNumbers(String str) {
  // Keep track of the sum of numbers
  int sum = 0;
  String temp = "";
  
  // Go over the string looking for any series of numbers
  for(int i = 0; i < str.length(); i++){
    // If a digit is found, check if it is alone or in a series
    if(Character.isDigit(str.charAt(i))){
      if(i < str.length() - 1 && Character.isDigit(str.charAt(i + 1))){
        temp += str.charAt(i);
      }else{
        // Character is alone or at the end of a series, convert string to int
        temp += str.charAt(i);
        sum += Integer.parseInt(temp);
        temp = "";
      }
    } 
  }
  
  // Return the sum
  return sum;
}

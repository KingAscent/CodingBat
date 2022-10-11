/*
 * Given a string str, if the string starts with "f" return "Fizz".
 * If the string ends with "b" return "Buzz". If both the "f" and "b"
 * conditions are true, return "FizzBuzz". In all other cases, return the
 * string unchanged. (See also: FizzBuzz Code)
 */

public String fizzString(String str) {
  // Check to see that there is a character in the string, and then see
  // if the string starts with "f" or ends with "b"
  boolean start = (1 <= str.length() && str.charAt(0) == 'f');
  boolean end = (1 <= str.length() && str.charAt(str.length() - 1) == 'b');
  
  // Return based on the condition
  if(start && end)
    return "FizzBuzz";
  if(start)
    return "Fizz";
  if(end)
    return "Buzz";
  return str;
}

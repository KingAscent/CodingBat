/*
 * Given an int n, return the string form of the number followed by "!".
 * So the int 6 yields "6!". Except if the number is divisible by 3 use
 * "Fizz" instead of the number, and if the number is divisible by 5 use
 * "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
 * Note: the % "mod" operator computes the remainder after division,
 * so 23 % 10 yields 3. What will the remainder be when one number divides
 * evenly into another? (See also: FizzBuzz Code and Introduction to Mod)
 */

public String fizzString2(int n) {
  // First check to see if n is divisible by 3 and/or 5
  boolean by3 = (n % 3 == 0);
  boolean by5 = (n % 5 == 0);
  
  // Return based on the condition
  if(by3 && by5)
    return "FizzBuzz!";
  if(by3)
    return "Fizz!";
  if(by5)
    return "Buzz!";
  return n + "!";
}

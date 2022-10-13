/*
 * Given two strings, a and b, create a bigger string made of the first
 * char of a, the first char of b, the second char of a, the second char of
 * b, and so on. Any leftover chars go at the end of the result.
 */

public String mixString(String a, String b) {
  String mix = "";
  // Check which string is shorter
  int shorter = Math.min(a.length(), b.length());
  
  // Start adding each character into the "mix" string
  for(int i = 0; i < shorter; i++){
    mix += String.valueOf(a.charAt(i)) + String.valueOf(b.charAt(i));
  }
  
  // Add remaining characters for strings that were longer than the other
  if(shorter < a.length())
    mix += a.substring(shorter, a.length());
  if(shorter < b.length())
    mix += b.substring(shorter, b.length());
  
  return mix;
}

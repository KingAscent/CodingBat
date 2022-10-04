/*
 * Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".
 */

public String stringBits(String str) {
  String bits = "";
  // To get every other character starting from the first. 
  for(int i = 0; i < str.length(); i += 2){
    bits += str.charAt(i);
  }
  return bits; 
}

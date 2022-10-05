/*
 * Given a string, return a string made of the chars at
 * indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".
 */

public String altPairs(String str) {
  String alt = "";
  
  // Over the course of the string, place pairs of chars into alt
  for(int i = 0; i < str.length(); i += 4){
    
    // Check if there is only one more char in the string
    int second = i + 2;
    if(str.length() < second)
      second = str.length();
    
    // Adds the char(s) to the string being returned
    alt += str.substring(i, second);
  }
  return alt;
}

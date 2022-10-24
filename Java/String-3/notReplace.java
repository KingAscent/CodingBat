/*
 * Given a string, return a string where every appearance of the lowercase word
 * "is" has been replaced with "is not". The word "is" should not be immediately
 * preceeded or followed by a letter -- so for example the "is" in "this" does
 * not count. (Note: Character.isLetter(char) tests if a char is a letter.)
 */

public String notReplace(String str) {
  // Initialize a new string that will be returned with the is-not replacements
  String nots = "";
  
  // Go over the string looking for "is"
  for(int i = 0; i < str.length(); i++){
    if(0 <= i - 1 && Character.isLetter(str.charAt(i - 1)) ||
          i + 2 < str.length() && Character.isLetter(str.charAt(i + 2))){
      nots += str.charAt(i);
    }else if(i + 1 < str.length() && str.substring(i, i + 2).equals("is")){
      // "is" is found without a character before or after it
      nots += "is not";
      i++;
    }else{
      nots += str.charAt(i);
    }
  }
  
  // Return the is-not string
  return nots;
}

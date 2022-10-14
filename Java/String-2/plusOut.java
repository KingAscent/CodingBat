/*
 * Given a string and a non-empty word string, return a version of
 * the original String where all chars have been replaced by pluses ("+"),
 * except for appearances of the word string which are preserved unchanged.
 */

public String plusOut(String str, String word) {
  String plusOut = "";
  
  // Go over the first string, looking for the word. If word is not found,
  // add a + to plusOut. Add word if it is found, and increase i by word length
  for(int i = 0; i < str.length(); i++){
    if(i <= str.length() - word.length()){
      if(str.substring(i, i + word.length()).equals(word)){
        plusOut += word;
        i += word.length() - 1;
      }else{
        plusOut += "+";
      }
    }else{
      plusOut += "+";
    }
  }
  return plusOut;
}

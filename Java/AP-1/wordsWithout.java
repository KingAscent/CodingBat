/*
 * Given an array of strings, return a new array without the strings that are
 * equal to the target string. One approach is to count the occurrences of the
 * target string, make a new array of the correct length, and then copy over
 * the correct strings.
 */

public String[] wordsWithout(String[] words, String target) {
  int targetCount = 0;
  
  // Go over the array, searching for the target string
  for(int i = 0; i < words.length; i++){
    if(words[i].equals(target))
      targetCount++;
  }
  
  // Create a new array with the length large enough to omit the target
  // Go over the original array, adding in the correct strings
  String[] correct = new String[words.length - targetCount];
  int index = 0;
  for(int i = 0; i < words.length; i++){
    if(!words[i].equals(target)){
      correct[index] = words[i];
      index++;
    }
  }
  
  // Return the new array
  return correct;
}

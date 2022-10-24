/*
 * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y'
 * in "heavy" and the 'z' in "fez" count, but not the 'y' in "yellow" (not case
 * sensitive). We'll say that a y or z is at the end of a word if there is not
 * an alphabetic letter immediately following it.
 * (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)
 */

public int countYZ(String str) {
  // Initialize a count to keep track of the y's and z's
  int count = 0;
  
  // Go over the string, checking to see if a y or z appears
  // If a y or z is found, check if a letter exists after it
  for(int i = 0; i < str.length(); i++){
    if((Character.toLowerCase(str.charAt(i)) == 'y' || 
        Character.toLowerCase(str.charAt(i)) == 'z') &&
        (i == str.length() - 1 || !Character.isLetter(str.charAt(i + 1))))
      count++;
  }
  
  // Return the count
  return count;
}

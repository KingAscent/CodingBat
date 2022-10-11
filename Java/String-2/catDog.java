/*
 * Return true if the string "cat" and "dog" appear the same
 * number of times in the given string.
 */

public boolean catDog(String str) {
  int catcount = 0;
  int dogcount = 0;
  
  // Find out how many times cat and dog appear in the string
  for(int i = 0; i < str.length() - 2; i++){
    if(str.substring(i, i + 3).equals("cat"))
      catcount++;
    if(str.substring(i, i + 3).equals("dog"))
      dogcount++;
  }
  return (catcount == dogcount);
}

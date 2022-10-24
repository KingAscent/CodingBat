/*
 * Given a string, return the length of the largest "block" in the string.
 * A block is a run of adjacent chars that are the same.
 */

public int maxBlock(String str) {
  // Initialize a variable to keep track of the largest block length
  int length = 0;
  
  // Go over the array searching for a block
  for(int i = 0; i < str.length(); i++){
    // For each element, start isBlock to true and currentBlock length to 0
    boolean isBlock = true;
    int currentBlock = 0;
    char start = str.charAt(i);
    
    // Compare characters ahead to the first character in the block
    for(int j = i; j < str.length(); j++){
      if(start == str.charAt(j) && isBlock){
        currentBlock++;
      }else{
        // Once the block ends, change isBlock to false to prevent characters
        // outside of the block from counting towards the currentBlock length
        isBlock = false;
      }
    }
    length = Math.max(length, currentBlock);
  }
  
  // Return the length of the longest block
  return length;
}

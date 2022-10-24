/*
 * We have a number of bunnies and each bunny has two big floppy ears.
 * We want to compute the total number of ears across all the bunnies
 * recursively (without loops or multiplication).
 */

public int bunnyEars(int bunnies) {
  // If bunnies is 0, return bunnies
  if(bunnies == 0) return bunnies;
  
  // Otherwise, call this method to count the number of bunny ears
  else return 2 + bunnyEars(bunnies - 1);
}

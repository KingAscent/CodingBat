/*
 * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
 * (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
 * have 3 ears, because they each have a raised foot. Recursively return the
 * number of "ears" in the bunny line 1, 2, ... n (without loops or
 * multiplication).
 */

public int bunnyEars2(int bunnies) {
  // Base case
  if(bunnies == 0 || bunnies == 1)
    return 2 * bunnies;
  
  // Depending on if we have even or odd bunnies
  if(bunnies % 2 == 1)
    return 2 + bunnyEars2(bunnies - 1);
  else
    return 3 + bunnyEars2(bunnies - 1);
}

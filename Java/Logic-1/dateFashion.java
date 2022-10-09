/*
 * You and your date are trying to get a table at a restaurant.
 * The parameter "you" is the stylishness of your clothes, in the
 * range 0..10, and "date" is the stylishness of your date's clothes.
 * The result getting the table is encoded as an int value with 0=no,
 * 1=maybe, 2=yes. If either of you is very stylish, 8 or more, then the
 * result is 2 (yes). With the exception that if either of you has style
 * of 2 or less, then the result is 0 (no). Otherwise the result is 1 (maybe).
 */

public int dateFashion(int you, int date) {
  // Check to see if you or date are 2 or less
  if(you <= 2 || date <= 2)
    return 0;
  
  // Check to see if either of us is stylish
  if(8 <= you || 8 <= date)
    return 2;
  
  // Neither of us are stylish, but neither of us are 2 or less
  return 1;
}

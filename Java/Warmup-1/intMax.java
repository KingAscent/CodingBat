/*
 * Given three int values, a b c, return the largest.
 */

public int intMax(int a, int b, int c) {
  int largest = a;
  if(largest < b)
    largest = b;
  if(largest < c)
    largest = c;
  return largest;
}

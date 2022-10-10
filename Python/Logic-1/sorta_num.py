# Given 2 ints, a and b, return their sum. However, sums in the range 10..19
# inclusive, are forbidden, so in that case just return 20.

def sorta_sum(a, b):
  # Check if the sum si between 10 and 19, inclusive
  # Otherwise, return the sum
  if (10 <= a + b) and (a + b <= 19):
    return 20
  return a + b

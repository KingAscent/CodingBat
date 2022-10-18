# Given 3 int values, a b c, return their sum. However, if one of the
# values is 13 then it does not count towards the sum and values to
# its right do not count. So for example, if b is 13, then both
# b and c do not count.

def lucky_sum(a, b, c):
  sum = 0
  
  # Check to see if a number is 13, and if so, do not add it and following
  # numbers to sum
  if a != 13:
    sum += a
    if b != 13:
      sum += b
      if c != 13:
        sum += c
  
  return sum

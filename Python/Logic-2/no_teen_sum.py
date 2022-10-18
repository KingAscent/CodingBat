# Given 3 int values, a b c, return their sum. However, if any of the values
# is a teen -- in the range 13..19 inclusive -- then that value counts as
# 0, except 15 and 16 do not count as a teens. Write a separate helper
# "def fix_teen(n):"that takes in an int value and returns that value
# fixed for the teen rule. In this way, you avoid repeating the teen
# code 3 times (i.e. "decomposition"). Define the helper below and at
# the same indent level as the main no_teen_sum().

def no_teen_sum(a, b, c):
  sum = 0
  
  # Call fixTeen to see if the value should be added to the sum
  sum += fix_teen(a)
  sum += fix_teen(b)
  sum += fix_teen(c)
  
  return sum

def fix_teen(n):
  # Check to see if n is in the range 13, 19 inclusive. If it is,
  # make sure it is not 15 or 16
  if (13 <= n <= 19):
    if (n == 15) or (n == 16):
      return n
    return 0
  return n

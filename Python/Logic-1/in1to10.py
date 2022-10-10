# Given a number n, return True if n is in the range 1..10, inclusive.
# Unless outside_mode is True, in which case return True if the number is
# less or equal to 1, or greater or equal to 10.

def in1to10(n, outside_mode):
  # Check if outside_mode is True, then return the proper boolean value
  if(outside_mode):
    return (n <= 1) or (10 <= n)
  
  # Since outside_mode is False, return True if 1 <= n <= 10
  return (1 <= n <= 10)

# The number 6 is a truly great number. Given two int values, a and b,
# return True if either one is 6. Or if their sum or difference is 6.
# Note: the function abs(num) computes the absolute value of a number.

def love6(a, b):
  # Check to see if any of the cases below are true, otherwise return false
  # These could also be written in one line, but are much easier to read separate
  if((a == 6) or (b == 6)):
    return True
  if(a + b == 6):
    return True
  if(abs(b - a) == 6):
    return True
  
  return False

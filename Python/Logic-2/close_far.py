# Given three ints, a b c, return True if one of b or c is "close" (differing
# from a by at most 1), while the other is "far", differing from both other
# values by 2 or more. Note: abs(num) computes the absolute value of a number.

def close_far(a, b, c):
  if (abs(a - b) <= 1 and 2 <= abs(a - c) and 2 <= abs(b - c)):
    return True
  return (abs(a - c) <= 1 and 2 <= abs(a - b) and 2 <= abs(b - c))

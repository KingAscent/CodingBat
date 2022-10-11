# Given two strings, return True if either of the strings appears at the
# very end of the other string, ignoring upper/lower case differences
# (in other words, the computation should not be "case sensitive").
# Note: s.lower() returns the lowercase version of a string.


def end_other(a, b):
  # Make both strings lower case to make the comparison simpler
  a = a.lower()
  b = b.lower()
  
  # Check to see if either string is at the end of the other
  return (a.endswith(b) or b.endswith(a))

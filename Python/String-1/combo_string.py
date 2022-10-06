# Given 2 strings, a and b, return a string of the form short+long+short,
# with the shorter string on the outside and the longer string on the inside.
# The strings will not be the same length, but they may be empty (length 0).

def combo_string(a, b):
  shorter = a
  longer = b
  
  # Check if b is shorter than a, and if it is, assign b to the shorter variable
  # and a to the longer variable
  if len(b) < len(a):
    shorter = b
    longer = a
    
  return shorter  + longer + shorter

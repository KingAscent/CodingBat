# Given 2 arrays of ints, a and b, return True if they have the same first
# element or they have the same last element. Both arrays will be length
# 1 or more.

def common_end(a, b):
  # Check if a and b are larger than length 1
  if(1 < len(a)) and (1 < len(b)):
    return (a[0] == b[0]) or (a[len(a) - 1] == b[len(b) - 1])
  
  # If one of them is length 1, then only check the first element
  return a[0] == b[0]

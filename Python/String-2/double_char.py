# Given a string, return a string where for every char in the
# original, there are two chars.

def double_char(str):
  double_char = ''
  
  # Add every character into double_char twice
  for i in range(len(str)):
    double_char += 2 * str[i]
  return double_char

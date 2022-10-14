# Return the number of times that the string "hi"
# appears anywhere in the given string.

def count_hi(str):
  count = 0
  
  # Check to see how many times 'hi' appears in a given string
  for i in range(len(str) - 1):
    if (str[i:i + 2] == 'hi'):
      count += 1
  
  return count

# Given a string, return the count of the number of times that
# a substring length 2 appears in the string and also as the
# last 2 chars of the string, so "hixxxhi" yields 1 (we won't
# count the end substring).

def last2(str):
  # Filter out strings of size 1 or less
  if len(str) <= 1:
    return 0
    
  # Get the last 2 chars from the given string
  count = 0
  end = str[-2:]
  
  for i in range(len(str) - 2):
    if str[i: i + 2] == end:
      count += 1
  
  return count

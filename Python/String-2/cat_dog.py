# Return True if the string "cat" and "dog" appear the same number of times
# in the given string.

def cat_dog(str):
  cat_count = 0
  dog_count = 0
  
  # Check to see how many times cat and dog appear in the string
  for i in range(len(str) - 2):
    if (str[i:i + 3] == 'cat'):
      cat_count += 1
    if (str[i:i + 3] == 'dog'):
      dog_count += 1
  
  return (cat_count == dog_count)

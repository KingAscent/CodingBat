# Given an array of ints, return True if one of the first 4 elements in
# the array is a 9. The array length may be less than 4.

def array_front9(nums):
  size = len(nums)
  
  # Limits the amount of integers checked if the array is larger than 4
  if 4 < size:
    size = 4
  
  # Checks to see if there is a 9 in the array's first 4 or less integers
  for i in range(size):
    if nums[i] == 9:
      return True
    
  return False

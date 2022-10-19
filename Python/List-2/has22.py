# Given an array of ints, return True if the array contains a 2 next to
# a 2 somewhere.

def has22(nums):
  # Go over the array, looking for a 2 followed by a 2
  for i in range(len(nums) - 1):
    if nums[i] == 2 and nums[i + 1] == 2:
      return True
  
  # There is no 2 followed by another 2, return false
  return False

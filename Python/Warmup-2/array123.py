# Given an array of ints, return True if the
# sequence of numbers 1, 2, 3 appears in the array somewhere.

def array123(nums):
  # Filter out arrays of less than 3 integers
  if len(nums) < 3:
    return False
    
  # Since every array will have at least 3 integers, use an else statement
  else:
    for i in range(len(nums) - 2):
      if(nums[i] == 1 and nums[i + 1] == 2 and nums[i + 2] == 3):
        return True
    
    return False

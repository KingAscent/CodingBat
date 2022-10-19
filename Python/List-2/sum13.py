# Return the sum of the numbers in the array, returning 0 for an empty array.
# Except the number 13 is very unlucky, so it does not count and numbers that
# come immediately after a 13 also do not count.

def sum13(nums):
  # Initialize the sum that will be returned
  sum = 0
  
  # Go over the array, exiting the loop once we find a 13
  i = 0
  while i < len(nums):
    if nums[i] == 13:
      i += 2
    else:
      sum += nums[i]
      i += 1
  
  # Return the sum
  return sum

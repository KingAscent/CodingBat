# Return the number of even ints in the given array.
# Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.

def count_evens(nums):
  # Keep track of how many evens are in the array
  evens = 0
  
  # Go through the array keeping track of how many evens are present
  for i in range(len(nums)):
    if nums[i] % 2 == 0:
      evens += 1
  
  # Return the count of evens
  return evens

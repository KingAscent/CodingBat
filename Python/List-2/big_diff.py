# Given an array length 1 or more of ints, return the difference between the
# largest and smallest values in the array.
# Note: the built-in min(v1, v2) and max(v1, v2) functions return the
# smaller or larger of two values.

def big_diff(nums):
  # Initialize the smallest and largest values
  largest = 0
  smallest = nums[0]
  
  # Go over the array comparing values to see which are the smallest and largest
  for i in nums:
    largest = max(largest, i)
    smallest = min(smallest, i)
  
  # Return the difference between the smallest and largest values
  return largest - smallest

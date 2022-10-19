# Return the "centered" average of an array of ints, which we'll say is the
# mean average of the values, except ignoring the largest and smallest values
# in the array. If there are multiple copies of the smallest value, ignore just
# one copy, and likewise for the largest value. Use int division to produce the
# final average. You may assume that the array is length 3 or more.

def centered_average(nums):
  # Sort the array from smallest to largest
  # Remove the first and last element
  nums.sort()
  nums = nums[1:-1]
  
  # Ignoring the first and last int, add the elements together
  sum = 0
  for i in nums:
    sum += i
  
  # Return the "centered" average
  return sum / len(nums)

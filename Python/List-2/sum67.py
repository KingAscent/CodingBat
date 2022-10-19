# Return the sum of the numbers in the array, except ignore sections of numbers
# starting with a 6 and extending to the next 7 (every 6 will be followed by
# at least one 7). Return 0 for no numbers.

def sum67(nums):
  # Initialize the sum that will be returned
  # The section variable tells us if we are in a 6 -> 7 section
  sum = 0
  section = False
  
  # Go over the array, adding elements to sum and ignoring anything in the
  # section of numbers starting with 6 and ending with 7
  for i in range(len(nums)):
    if nums[i] == 6:
      section = True
    if not section:
      sum += nums[i]
    if nums[i] == 7 and section:
      section = False
  
  # Return the sum
  return sum

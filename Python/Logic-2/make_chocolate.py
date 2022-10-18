# We want make a package of goal kilos of chocolate. We have small bars
# (1 kilo each) and big bars (5 kilos each). Return the number of small bars
# to use, assuming we always use big bars before small bars. Return -1 if it
# can't be done.

def make_chocolate(small, big, goal):
  # Check how many bigs we have
  bigsNeeded = goal / 5
  if (bigsNeeded <= big):
    goal -= bigsNeeded * 5
  else:
    goal -= big * 5
  
  # Checks if we have enough smalls to make up for the remainder
  if (goal <= small):
    return goal
  
  # If this point is reached, then it is not possible to build the package
  return -1

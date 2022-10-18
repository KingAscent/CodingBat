# We want to make a row of bricks that is goal inches long. We have a number of
# small bricks (1 inch each) and big bricks (5 inches each). Return True if it
# is possible to make the goal by choosing from the given bricks. This is a
# little harder than it looks and can be done without any loops.
# See also: Introduction to MakeBricks

def make_bricks(small, big, goal):
  # Ensure we have enough brikcs to meet our goal
  if small + (big * 5) < goal:
    return False
  
  # Check if we have enough smalls to reach our goal if
  # we do not have enough big bricks
  if small < goal % 5:
    return False
  
  return True

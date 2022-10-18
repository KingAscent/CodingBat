def make_bricks(small, big, goal):
  # Ensure we have enough brikcs to meet our goal
  if small + (big * 5) < goal:
    return False
  
  # Check if we have enough smalls to reach our goal if
  # we do not have enough big bricks
  if small < goal % 5:
    return False
  
  return True

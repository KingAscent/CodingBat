# Given a string and a non-negative int n, we'll say that the front of the string 
# is the first 3 chars, or whatever is there if the string is less than length 3.
# Return n copies of the front;

def front_times(str, n):
  times = ""
  front = ""
  
  # Checks if there are more than 3 characters in the given string
  if len(str) < 3:
    front = str
  else:
    front = str[:3]
    
  # Repeats the string n times
  for i in range(n):
    times += front

  return times

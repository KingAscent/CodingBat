# You are driving a little too fast, and a police officer stops you.
# Write code to compute the result, encoded as an int value: 0=no ticket,
# 1=small ticket, 2=big ticket. If speed is 60 or less, the result is 0.
# If speed is between 61 and 80 inclusive, the result is 1. If speed is 81 or
# more, the result is 2. Unless it is your birthday -- on that day, your speed
# can be 5 higher in all cases.

def caught_speeding(speed, is_birthday):
  # Check speed and increase the limit if is_birthday is true
  if (speed <= 60) or (speed <= 65 and is_birthday):
    return 0
  if (speed <= 80) or (speed <= 85 and is_birthday):
    return 1
  
  # If neither of the cases above are true, speed is 81, 86 on birthday, or more
  return 2

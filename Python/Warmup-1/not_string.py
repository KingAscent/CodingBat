# Given a string, return a new string where "not " has been added to the front.
# However, if the string already begins with "not", return the string unchanged.

def not_string(str):
  if 3 <= len(str) and str[:3] == 'not':
    return str
  return 'not ' + str

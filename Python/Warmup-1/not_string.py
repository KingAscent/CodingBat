def not_string(str):
  if 3 <= len(str) and str[:3] == 'not':
    return str
  return 'not ' + str

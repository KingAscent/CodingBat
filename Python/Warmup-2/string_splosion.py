# Given a non-empty string like "Code" return a string like "CCoCodCode".

def string_splosion(str):
  splosion = ""
  
  # len(str) + 1 so that we can reach the last character of the string
  for i in range(len(str) + 1):
    splosion += str[:i]
  return splosion

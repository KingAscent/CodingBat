def front_back(str):
  if len(str) <= 1:
    return str
  front = str[0]
  back = str[len(str) - 1]
  return back + str[1:-1] + front

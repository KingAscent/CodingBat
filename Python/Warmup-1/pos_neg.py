def pos_neg(a, b, negative):
  if not negative:
    return (0 < a and b < 0) or (a < 0 and 0 < b)
  return a < 0 and b < 0

public int max1020(int a, int b) {
  if(10 <= a && a <= 20 && 10 <= b && b <= 20){
    if(b < a)
      return a;
    return b;
  }
  if(10 <= a && a <= 20)
    return a;
  if(10 <= b && b <= 20)
    return b;
  return 0;
}

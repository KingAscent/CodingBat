public int close10(int a, int b) {
  int aclose = Math.abs(a - 10);
  int bclose = Math.abs(b - 10);
  if(aclose < bclose)
    return a;
  if(bclose < aclose)
    return b;
  return 0;
}

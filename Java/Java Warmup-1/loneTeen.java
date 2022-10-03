public boolean loneTeen(int a, int b) {
  return ((13 <= a && a <= 19) && (b < 13 || 19 < b)) || 
         ((13 <= b && b <= 19) && (a < 13 || 19 < a)); 
}

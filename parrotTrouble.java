public boolean parrotTrouble(boolean talking, int hour) {
  return talking && (hour < 7 || 20 < hour);
}

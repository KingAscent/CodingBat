public String notString(String str) {
  if(3 <= str.length() && str.substring(0, 3).equals("not")){
    return str;
  }
  return "not " + str;
}

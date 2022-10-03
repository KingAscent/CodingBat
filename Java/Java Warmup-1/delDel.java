public String delDel(String str) {
  if(4 <= str.length()){
    if(str.substring(1, 4).equals("del")){
      return str.charAt(0) + str.substring(4, str.length());
    }
  }
  return str;
}

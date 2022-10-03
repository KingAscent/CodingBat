public String front3(String str) {
  if(str.length() <= 3){
    return str + str + str;
  }
  String front = str.substring(0, 3);
  return front + front + front;
}

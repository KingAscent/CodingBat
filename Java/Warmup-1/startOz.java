/*
 * Given a string, return a string made of the first 2 chars (if present), however include first char
 * only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
 */

public String startOz(String str) {
  String start = "";
  if(1 <= str.length() && str.charAt(0) == 'o'){
    start += 'o';
  }
  if(2 <= str.length() && str.charAt(1) == 'z'){ 
    start += 'z';
  }
  return start;
}

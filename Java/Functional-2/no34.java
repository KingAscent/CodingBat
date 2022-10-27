/*
 * Given a list of strings, return a list of the strings, omitting any string
 * length 3 or 4.
 */

public List<String> no34(List<String> strings) {
  // Remove any strings of length 3 or 4
  strings.removeIf(s -> 3 <= s.length() && s.length() <= 4);
  return strings;
}

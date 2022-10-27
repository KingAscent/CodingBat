/*
 * Given a list of strings, return a list of the strings, omitting any string
 * length 4 or more.
 */

public List<String> noLong(List<String> strings) {
  // Remove any strings of length 4 or more
  strings.removeIf(s -> 4 <= s.length());
  return strings;
}

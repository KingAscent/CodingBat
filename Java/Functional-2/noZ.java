/*
 * Given a list of strings, return a list of the strings, omitting any string
 * that contains a "z". (Note: the str.contains(x) method returns a boolean)
 */

public List<String> noZ(List<String> strings) {
  // Remove any strings that contain a z
  strings.removeIf(s -> s.contains("z"));
  return strings;
}

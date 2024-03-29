/*
 * Given a list of strings, return a list where each string has "y" added at its
 * end, omitting any resulting strings that contain "yy" as a substring anywhere.
 */

public List<String> noYY(List<String> strings) {
  // Add y to the end of all strings, then remove any that contain yy anywhere
  strings.replaceAll(s -> s + "y");
  strings.removeIf(s -> s.contains("yy"));
  return strings;
}

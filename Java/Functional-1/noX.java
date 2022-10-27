/*
 * Given a list of strings, return a list where each string has all its "x" removed.
 */

public List<String> noX(List<String> strings) {
  strings = strings.stream()
    .map(s -> s.replaceAll("x", ""))
    .collect(Collectors.toList());
  return strings;
}

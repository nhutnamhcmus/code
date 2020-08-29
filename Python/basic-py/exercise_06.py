def changeCase(s):
  a = s.upper()  # convert string to "AAA BBB CCC"
  b = s.lower()  # convert string to "aaa bbb ccc"
  return [a, b]

str = "AAA bbb CCC"
print(changeCase(str))
def findOccurence(s):
  a = s.find("b")#find first occurrence of "b" in the string 
  b = s.find("ccc")#find first occurence  of "ccc" in the string
  return [a, b]

str = "aaabbccc"
print(findOccurence(str))
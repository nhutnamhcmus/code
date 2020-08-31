def findMaximum(x, y):
  max2 = 0
  if(x > y):
    max2 = x
  else:
    max2 = y
  return max2
print(findMaximum(3, 2))

def _max(x, y):
    return x if x > y else y

print(_max(3, 2))
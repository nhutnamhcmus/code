def getcube(list):
  l1 = [x*x*x for x in list]
  return l1
l1 = getcube([1, 3, 4, 5])
print(l1)
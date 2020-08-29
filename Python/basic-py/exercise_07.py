def getSubList():
  l = [1, 4, 9, 10, 23]
  l1 = l[0:3] # sublist from index 0 to 3
  l2 = l[3:] # sublist from 3 uptil end
  return [l1, l2]
[l1, l2] = getSubList()
print(l1)
print(l2)
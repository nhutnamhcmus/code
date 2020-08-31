def listofevenodds(list):
  l1 = []
  l2 = []  
  l1 = [x for x in list if (x % 2 == 0)]
  l2 = [x for x in list if (x % 2 != 0)]
  return[l1, l2]
  
print(listofevenodds([1, 2, 3, 5, 7]))

def _listofevenodds(list):
  l1 = []
  l2 = []  
  l1 = [x for x in list if (x % 2 == 0)]
  l2 = [x for x in list if (x not in l1)]
  return[l1, l2]

print(_listofevenodds([1, 2, 3, 5, 7]))
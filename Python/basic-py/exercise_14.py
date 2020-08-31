def _get_square(list):
  l1 = [x*x for x in range(0, len(list), 2) if x % 3 != 0]
  return l1
  
print(_get_square([1, 2, 3, 4, 5]))

def get_square(list):
  l1 = [x*x for x in list  if x % 3 != 0 and x % 2 == 0]
  return l1
  
print(get_square([1, 2, 3, 4, 5]))
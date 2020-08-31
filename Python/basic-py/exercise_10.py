def getsquare():
  l1 = [x*x for x in range(1, 11)]
  return l1


l1 = getsquare()
print(l1)


def square(list):
    result = [x**2 for x in list]
    return result

l2 = [1, 2, 3, 4]
print(l2)
l3 = square(l2)
print(l3)
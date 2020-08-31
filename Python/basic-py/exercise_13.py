def even_square_sum(list):
  even = [x * x for x in list if x % 2 == 0]
  return sum(even)
  
print(even_square_sum([1, 2, 3, 4, 5]))
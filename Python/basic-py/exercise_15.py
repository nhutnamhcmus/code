# Use a Module
import math
print(math.cos(0.0))
print(math.radians(275))

import module
module.my_crush("Lê Nam")

# Function
def do_hello():
  print("Hello")
  print("World")
do_hello()

# Parameterized function
def add_one(val):
  print("Function got value", val + 1)
  return
add_one(1)

# Parameterized function with a return statement 
def add_one(val):
  print("Function got value", val)
  return val + 1
value = add_one(1)
print(value)
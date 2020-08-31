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

# Exercise 15
# Use math module
import math 
def _gcd(a, b): 
  return math.gcd(a, b)
print(_gcd(24, 18))

# Use recursive
def _gcd_recursive(a, b):
    if b == 0:
        return a
    else:
        return _gcd_recursive(b, a % b)

print(_gcd_recursive(24, 18))

def _gcd_(x, y):
    while y != 0:
        (x, y) = (y, x % y)
    return x

print(_gcd_(24, 18))
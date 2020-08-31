import math
def calculateSinCosTan(x):
  sine = math.sin(x)
  cos = math.cos(x)
  tan = math.tan(x)
  return [sine, cos, tan]

print("sine:", calculateSinCosTan(-1))
print("cos:", calculateSinCosTan(0))
print("tan:", calculateSinCosTan(1))
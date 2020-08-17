number = 10

if number > 10:
    print("number is totally bigger than 10.")
elif number < 10:    # This elif clause is optional.
    print("number is smaller than 10.")
else:                  # This is optional too.
    print("number is indeed 10.")

print("Number name array")
for number in [1, 2, 3, 4, 5]:
    print(number)

print("Animal name array")
for animal in ["dog", "cat", "mouse"]:
    print("{} is a mammal".format(animal))

print("Print from 0 to 9: ")
for i in range(10):
    print(i)

print("Print from 4 to 7: ")
for i in range(4, 8):
    print(i)
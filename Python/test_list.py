li = []

my_list = [1, 2, 3, 4, 5]

print(my_list)

li.append(1)    # li is now [1]
li.append(2)    # li is now [1, 2]
li.append(4)    # li is now [1, 2, 4]
li.append(3)    # li is now [1, 2, 4, 3]

# Show li
print(li)

# Remove from the end with pop
li.pop()        # => 3 and li is now [1, 2, 4]
print(li)
# Let's put it back
li.append(3)    # li is now [1, 2, 4, 3] again.
print(li)

# access
print(li[1])

print(li[-1])

# print(li[4]) # Error

# list from index 1 to 3 => [2, 4]
print(li[1:3])

# list starting from index 2 => [4, 3]
print(li[2:])

# list from beginning until index 3  => [1, 2, 4]
print(li[:3])

# list selecting every second entry => [1, 4]
print(li[::2])

# Return list in reverse order => [3, 4, 2, 1]
print(li[::-1])

li2 = li[:]
print(li2)

# Remove arbitrary elements from a list with "del"
# We wil delete element at index = 2
del li[2]
print(li)

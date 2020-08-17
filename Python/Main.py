from LinkedList import LinkedList

llist = LinkedList()
llist.append("A")
llist.append("B")
llist.append("C")


llist.insert_after_node(llist.head.next, "D")

llist.print_list()  
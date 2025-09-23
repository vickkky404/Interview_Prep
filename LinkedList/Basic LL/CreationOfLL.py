# define a node.
class Node:
    def _init_(self, data):
        self.data = data
        self.next = None
    
# define a linkedlist
class LinkedList:
    def __init__(self):
        self.head = None   # initially empty list

# print 
def print_list(self):
    temp = self.head
    while temp:
        print(temp.data , end" -> ")
        temp = temp.next
    print("None")

# node creation
    11 = LinkedList()
    11.head = Node(10)
    second = Node(20)
    third = Node(30)



# connect
    11.head.next = second 
    second.next = third
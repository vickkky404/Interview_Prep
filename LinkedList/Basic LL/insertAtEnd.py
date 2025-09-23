def insert_At_End(delf, data):
    new_node = Node(data)
    if self.head is None:
        self.head = new_node
        return
    temp = self.head
    while temp.next:
        temp = temp.next
        temp.next = new_node
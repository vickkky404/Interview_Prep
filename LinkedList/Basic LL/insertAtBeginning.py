def insert_at_Beginning(self , data):
    new_node = Node(data)
    new_node.next = self.head
    self.head = new_node
class Node:
    val = None
    next = None
    def __init__(self, value=None):
        self.val = value

class LinkedList():
    def __init__(self, value):
        self.head = Node(value)
    
    def __len__(self):
        count = 0
        temp = self.head
        while temp.next != None:
            count += 1
            temp = temp.next
        count += 1
        return count

    def add(self, value, position=None):
        new_node = Node(value)
        prev = self.head
        if prev.next != None:
            cur = prev.next
        else:
            cur = prev
        pos_counter = 1

        if position == 0:
            new_node.next = self.head
            self.head = new_node
            return

        while cur.next != None:            
            if position == pos_counter:
                new_node.next = cur
                prev.next = new_node
                return
            pos_counter += 1
            cur = cur.next
            prev = prev.next
        cur.next = new_node
    
    def delete(self, position=None):
        prev = self.head
        if prev.next != None:
            cur = prev.next
        else:
            cur = prev
        pos_counter = 1
        if position == 0:
            self.head = self.head.next
            return

        while cur.next != None:            
            if position == pos_counter:
                prev.next = cur.next
                return
            pos_counter += 1
            cur = cur.next
            prev = prev.next
        prev.next = None

    
    def __str__(self):
        temp = self.head
        print_str = ""
        while temp.next != None:
            print_str += (str(temp.val) + " --> ")
            temp = temp.next
        print_str += str(temp.val)
        return print_str


# ll = LinkedList(1)
# ll.print_ll()
# ll.add(2)
# ll.print_ll()
# ll.add(3)
# ll.print_ll()
# ll.add(4, position=1)
# ll.print_ll()
# ll.add(5, position=2)
# ll.print_ll()
# ll.add(6, position=2)
# ll.print_ll()
# ll.add(10)
# ll.print_ll()
# ll.delete(position=5)
# ll.print_ll()
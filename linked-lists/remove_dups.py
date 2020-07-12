from linked_list import LinkedList, Node

class Remove_dups(LinkedList):
    def __init__(self, value):
        super().__init__(value)

    def remdups(self): 
        temp = self.head
        s = set()
        if self.__len__() > 1:
            s.add(temp.val)
            temp = temp.next
        position = 1
        while temp.next != None:
            if temp.val in s:
                self.delete(position)
            else:
                s.add(temp.val)
            position += 1
            temp = temp.next
        if temp.val in s:
                self.delete()

ll = Remove_dups(1)
print(ll)
ll.add(1)
print(ll)
ll.add(2)
print(ll)
ll.add(2)
print(ll)
ll.remdups()
print(ll)
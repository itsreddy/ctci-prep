from linked_list import LinkedList, Node

class Kth_to_last(LinkedList):
    def __init__(self, value):
        super().__init__(value)

    def find(self, k):
        if k == 0:
            return "Invalid Input"
        temp = self.head
        last = self.__len__() - 1
        kth_to_last = last - k
        i = 0
        while i <= kth_to_last:
            temp = temp.next
            i += 1
        return temp.val

ll = Kth_to_last(1)
print(ll)
ll.add(2)
print(ll)
ll.add(3)
print(ll)
ll.add(4)
print(ll)
ll.add(5)
print(ll)
print(ll.find(7))

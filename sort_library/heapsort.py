import math

class Heapsort:
    def __init__(self, input_array):
        self.array = input_array
        self.heap = input_array
    
    def check_parent(self, index, min_heap=True):
        if index == 0:
            return
        if min_heap:
            if self.array[index] < self.array[(index-1)//2]:
                self.array[index], self.array[(index-1)//2] = self.array[(index-1)//2], self.array[index]
                self.check_parent((index-1)//2, min_heap=min_heap)
            else:
                return
        else:
            if self.array[index] > self.array[(index-1)//2]:
                self.array[index], self.array[(index-1)//2] = self.array[(index-1)//2], self.array[index]
                self.check_parent((index-1)//2, min_heap=min_heap)
            else:
                return
    
    def heapify(self, id, min_heap=True):
        # depth = math.log2(len(self.array))
        for index in range(len(self.array[:id])):
            self.check_parent(index, min_heap=min_heap)
            # print("heap:")
            # self.print_heap(index)

    def print_heap(self, id):
        heap = self.array[:id+1]
        depth = int(math.log2(len(self.array)) + 1)
        for d in range(depth):
            for i in range(depth-1-d):
                print("\t", end="")
            for i in range(2**d):
                if len(heap) == 0:
                    break
                print(heap.pop(0), end="\t")
                for i in range(depth-1-d):
                    print("\t", end="")
            print("")
    
    def heap_sort(self, min_heap=True):
        for i in range(len(self.array)):
            self.heapify(id=len(self.array)-i, min_heap=min_heap)
            item = self.array.pop(0)
            self.array.append(item)
        
            # print("array:", self.array)
        return self.array

a = [4,3,2,1,4,6,1,8,9,10,11]
heap = Heapsort(a)

# heap.heapify()

# print(heap.heap_sort())
print(heap.heap_sort(min_heap=False))
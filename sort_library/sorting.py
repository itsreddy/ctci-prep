class Sorting:
    def insertion_sort(self, array):
        for i in range(len(array)):
            for j in range(i-1, -1, -1):
                if array[i] < array[j]:
                    array[j], array[i] = array[i], array[j] # swap
                else:
                    break
                i -= 1
        return array

    def selection_sort(self, array):
        for i in range(len(array)):
            min_idx = i
            for j in range(i+1, len(array)):
                if array[j] < array[min_idx]:
                    array[j], array[min_idx] = array[min_idx], array[j] # swap
        return array

    def merge_sort(self, array):
        def merge(a, b):
            i, j = 0, 0
            new = []
            while i < len(a) and j < len(b):
                if a[i] < b[j]:
                    new.append(a[i])
                    i += 1
                else:
                    new.append(b[j])
                    j += 1
            while j < len(b):
                new.append(b[j])
                j+= 1
            while i < len(a):
                new.append(a[i])
                i+= 1
            return new

        def split(array):
            if len(array) == 1:
                return array
            start, end = 0, len(array)
            mid = (start + end) // 2
            first = split(array[start: mid])
            second = split(array[mid: end])
            # print(array, first, second)
            return merge(first, second)
        
        return split(array)

    # def quick_sort(self, array):
    #     def partition(array, start, end):
    #         pivot = array[end]
    #         j = start
    #         for i in range(start, end+1):
    #             if array[i] <= pivot:
    #                 array[i], array[j] = array[j], array[i]
    #                 j += 1
                
    #         return array, j - 1

    #     def helper(array, start, end):
    #         if start < end:
    #             array, partition_index = partition(array, start, end)
    #             array = helper(array, start, partition_index-1)
    #             array = helper(array, partition_index+1, end)
    #         return array
        
    #     return helper(array, 0, len(array)-1)

    def quick_sort_twoway(self, array):

        def partition(start, end):
            pivot = array[end]
            j = start - 1
            for i in range(start, end+1):
                if array[i] <= pivot:
                    j += 1
                    array[i], array[j] = array[j], array[i]           
            return j, j

        def helper(start, end):
            if start <= end:
                p1, p2 = partition(start, end)
                helper(start, p1-1)
                helper(p2+1, end)
            return
        
        helper(0, len(array)-1)

        return array

    def quick_sort_threeway(self, array):

        def partition(start, end):
            pivot = array[end]
            j = start - 1
            for i in range(start, end+1):
                if array[i] <= pivot:
                    print('in')
                    j += 1
                    array[i], array[j] = array[j], array[i]
                        
            print(array)
            return j, j

        def helper(start, end):
            if start <= end:
                p1, p2 = partition(start, end)
                helper(start, p1-1)
                helper(p2+1, end)
            return
        
        helper(0, len(array)-1)

        return array
    
    def partition_any(self, start, end, pivot_ix):
        pivot = array[pivot_ix]
        j = start - 1
        for i in range(start, end+1):
            if i == pivot_ix:
                continue
            if array[i] <= pivot:
                j += 1
                if j == pivot_ix:
                    j += 1
                array[i], array[j] = array[j], array[i]
        if j < pivot_ix:
            j += 1
        array[pivot_ix], array[j] = array[j], array[pivot_ix]           
        print(array)


a = [4,3,2,1,4,6,1,8,4]
# s = Sorting()
# print(s.quick_sort_threeway(a))

arr,start, end = a, 0, len(a)-1

def partition(array, start, end, pivot_ix):
    pivot = array[pivot_ix]
    j = start - 1
    for i in range(start, end+1):
        if i == pivot_ix:
            continue
        if array[i] <= pivot:
            j += 1
            if j == pivot_ix:
                j += 1
            array[i], array[j] = array[j], array[i]
        # if array[i] == pivot:
        #     partition(start, end-1, i)
        #     j += 1
    if j < pivot_ix:
        j += 1
    array[pivot_ix], array[j] = array[j], array[pivot_ix]
                
    # print(array, j)
    return array, j


print(arr)
# print(partition(arr, start, end, end))
# print([i for i in range(7, 5, -1)])

def partition_threeway(array, start, end, pivot_ix):
    array, fi = partition(array, start, end, pivot_ix)
    print(array, fi)
    j = fi - 1
    i = start
    while i <= j:
        if array[i] == array[fi]:
            array[i], array[j] = array[j], array[i]
        j -= 1
        i += 1
    
    return array

print('op: ', partition_threeway(arr, start, end, 3))
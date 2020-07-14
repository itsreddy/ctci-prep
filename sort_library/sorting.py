def insertion_sort(array):
    for i in range(len(array)):
        for j in range(i-1, -1, -1):
            if array[i] < array[j]:
                array[j], array[i] = array[i], array[j] # swap
            else:
                break
            i -= 1
    return array

def selection_sort(array):
    for i in range(len(array)):
        min_idx = i
        for j in range(i+1, len(array)):
            if array[j] < array[min_idx]:
                array[j], array[min_idx] = array[min_idx], array[j] # swap
    return array

def merge_sort(array):
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

a = [3,1,2,6,1,8,9]
print(merge_sort(a))
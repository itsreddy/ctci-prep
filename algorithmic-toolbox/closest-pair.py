import math

class Point:
    def __init__(self, x, y):
        self.x = x
        self.y = y

class Pairs:
    def __init__(self, input_array):
        self.input_array = input_array
        self.points = []
    
    def build_points_array(self):
        for item in self.input_array:
            self.points.append(Point(item[0], item[1]))

    def sort_array(self):
        self.points.sort(key= lambda item: item.x)
    
    def find_distance(self, a, b):
        return math.sqrt(((a.x - b.x)**2) + ((a.y - b.y)**2))
    
    def calculate_distances(self, start, mid, end):
        min_dist = math.inf
        for i in range(mid+1, end+1):
            dist = self.find_distance(self.points[mid], self.points[i])
            if (dist < min_dist):
                min_dist = dist
        
        for i in range(start, mid+1):
            dist = self.find_distance(self.points[mid+1], self.points[i])
            if (dist < min_dist):
                min_dist = dist
        
        return min_dist
    
    def find_close_pair(self, start, end):
        if start < end:
            mid = (start + end) // 2
            d1 = self.find_close_pair(start, mid)
            d2 = self.find_close_pair(mid+1, end)
            d3 = self.calculate_distances(start, mid, end)

            return min(d1, d2, d3)
        else:
            return math.inf

    def closest_distance(self):
        self.build_points_array()
        self.sort_array()
        return self.find_close_pair(0, len(self.points)-1)

a = [[4,4],[-2,-2],[-3,-4],[-1,3],[2,3],[-4,0],[1,1],[-1,-1],[3,-1],[-4,2],[-2,4]]
pairs = Pairs(a)

# x = "{:.6f}".format(pairs.closest_distance())

print(pairs.closest_distance())
    

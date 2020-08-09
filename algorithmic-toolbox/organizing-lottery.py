class Number:

    def __init__(self, number, id):
        self.number = number
        self.id = id
    
    def __str__(self):
        return "number: {}, id: {}".format(self.number, self.id)

class Lottery:

    def __init__(self, r, p):
        self.ranges, self.points = r, p

    def build_list(self):
        
        integrated = []

        for r in self.ranges:
            integrated.append(Number(r[0], 0))
            integrated.append(Number(r[1], 1))
            
        for p in self.points:
            integrated.append(Number(p, 2))
        
        return integrated
    
    def sort_list(self, l):

        l.sort(key = lambda item: item.number)

        return l
    
    def find_payout(self):
        n_ranges = len(self.ranges)

        full_list = self.build_list()
        
        sorted_list = self.sort_list(full_list)

        opened, closed = 0, 0

        for item in sorted_list:
            if item.id == 0:
                opened += 1
            elif item.id == 1:
                closed += 1
            elif item.id == 2:
                payout = opened - closed
                print("point: {}, payout: {}".format([item.number,item.id], payout))



ranges = [[-10,10]]
points = [100, -100, 0]
lottery = Lottery(ranges, points)

lottery.find_payout()
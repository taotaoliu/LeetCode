class Solution:
    def hammingDistance(self, x, y):
        num = 0
        n_x = ''.join(bin(x).replace('0b', ''))
        n_y = ''.join(bin(y).replace('0b', ''))
        if len(n_x) > len(n_y):
            for _ in range(len(n_x) - len(n_y)):
                n_y = '0' + n_y
        else:
            for _ in range(len(n_y) - len(n_x)):
                n_x = '0' + n_x
        print("x: %s" % n_x)
        print("y: %s" % n_y)
        for i in range(len(n_x)):
            if n_x[i: i+1] != n_y[i: i+1]:
                num += 1
        return num

    def hammingDistanceSolution(self, x, y):
        num = 0
        z = int(x ^ y)
        while z != 0:
            if z % 2 == 1:
                num += 1
            z = int(z / 2)
        return num

s = Solution()
print(s.hammingDistance(3, 8))
print(s.hammingDistanceSolution(3, 8))



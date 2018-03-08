class Solution:
    UpKey = 1
    RightKey = 2
    def judgeCircle(self, moves):
        n = 0
        for m in moves:
            if m == 'U':
                n += self.UpKey
            if m == 'D':
                n += -self.UpKey
            if m == 'R':
                n += self.RightKey
            if m == 'L':
                n += -self.RightKey
        return n == 0

s = Solution()
print(s.judgeCircle("URLDD"))

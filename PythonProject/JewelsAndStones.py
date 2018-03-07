class Solution:
    def numJewelsInStones(self, J, S):
        i = 0
        for j in J:
            for s in S:
                if j == s:
                    i += 1
        return i


# J = "aA"
# S = "aAAbbbb"
J = "zZ"
S = "ZZz"

s = Solution()
print(s.numJewelsInStones(J, S))
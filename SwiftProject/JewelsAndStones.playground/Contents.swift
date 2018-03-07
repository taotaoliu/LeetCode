//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

class Solution {
    func numJewelsInStones(_ J: String, _ S: String) -> Int {
        var i: Int = 0
        for j in J {
            for s in S {
                if j == s {
                    i += 1
                }
            }
        }
        return i
    }
}

let s = Solution()
//let J = "aA", S = "aAAbbbb"
let J = "zZ", S = "ZZz"
let num = s.numJewelsInStones(J, S)
print(num)

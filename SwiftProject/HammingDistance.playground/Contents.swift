//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

class Solution {
    func hammingDistance(_ x: Int, _ y: Int) -> Int {
        var num: Int = 0
        var n_x = String(x, radix:2)
        var n_y = String(y, radix: 2)
        if n_x.characters.count > n_y.characters.count {
            for _ in 0..<(n_x.characters.count - n_y.characters.count) {
                n_y.insert("0", at: String.Index(encodedOffset: 0))
            }
        } else {
            for _ in 0..<(n_y.characters.count - n_x.characters.count) {
                n_x.insert("0", at: String.Index(encodedOffset: 0))
            }
        }
        
        print("x: \(n_x)")
        print("y: \(n_y)")
        
        var n_x_character = Array<Character>()
        var n_y_character = Array<Character>()
        for c in n_x.characters {
            n_x_character.append(c)
        }
        for c in n_y.characters {
            n_y_character.append(c)
        }
        
        for i in 0..<n_x_character.count {
            if n_x_character[i] != n_y_character[i] {
                num += 1
            }
        }
        return num
    }
}

let s = Solution()
let n = s.hammingDistance(3, 18)
print(n)


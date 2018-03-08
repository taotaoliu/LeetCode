//: Playground - noun: a place where people can play

import UIKit

var str = "Hello, playground"

enum Direction: String {
    case Up = "U"
    case Down = "D"
    case Right = "R"
    case Left = "L"
}

enum DirectionKey: Int {
    case UpKey = 1
    case RightKey = 2
}

class Solution {
    func judgeCircle(_ moves: String) -> Bool {
        var n: Int = 0
        for c in moves {
            switch String(c) {
            case Direction.Up.rawValue:
                n += DirectionKey.UpKey.rawValue
            case Direction.Down.rawValue:
                n += -DirectionKey.UpKey.rawValue
            case Direction.Left.rawValue:
                n += -DirectionKey.RightKey.rawValue
            case Direction.Right.rawValue:
                n += DirectionKey.RightKey.rawValue
            default:
                break
            }
        }
        return n == 0
    }
}

let s = Solution()
s.judgeCircle("UDUUUDDDLLRR")


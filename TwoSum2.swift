class Solution {
    func twoSum(_ numbers: [Int], _ target: Int) -> [Int] {
        var finalArray: [Int] = []
        for i in 0..<numbers.count {
            for j in i+1..<numbers.count {
                if numbers[j] + numbers[i] == target {
                    finalArray = [i+1, j+1]
                }     
            }
        }
        return finalArray
    }
}
